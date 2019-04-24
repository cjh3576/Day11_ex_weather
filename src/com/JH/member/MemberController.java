package com.JH.member;

import java.util.HashMap;
import java.util.Scanner;

public class MemberController {
	private MemberInit mi;
	private Scanner sc;
	private HashMap<String, Member> map;
	private MemberView mv;
	public MemberController() {
		mi = new MemberInit();
		sc = new Scanner(System.in);
		map = new HashMap<String, Member>();
		mv = new MemberView();
	}
	
	public void start() {
		map =mi.setMember();
		boolean check = true;
		while(check) {
			System.out.println("1. 회원가입   2. 로그인  3. 회원탈퇴  4. 회원전체정보보기  5. 종료");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				Member m = mi.memberJoin();
				map.put(m.getId(), m);
				break;
			case 2:
				mi.memberLogin(map);
				break;
			case 3:
				String s =mi.memberDelete(map);
				if(s == null) {
					s="삭제가 실패되었습니다";
					mv.view(s);
				}
				else {
					mv.view(s);
				}
				break;
			case 4:
				mv.view(map);
				break;
			case 5:
				check = !check;
				break;
				default :
					System.out.println("잘못된 입력입니다");
					break;
				
			}
		}
	}
}
