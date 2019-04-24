package com.JH.member;

import java.util.HashMap;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberInit {
	private String members;
	private HashMap<String, Member> hm;
	private StringTokenizer st;
	private Member member;
	private Scanner sc;

	public MemberInit() {
		StringBuffer sb = new StringBuffer();
		//이름, id ,pw, 나이, 레벨
		sb.append("JH, jH, Jh, 26, 1,");
		sb.append("SM, sM, Sm, 30, 2,");
		sb.append("MJ, mJ, Mj, 23, 2,");
		sb.append("IU, iU, Iu, 15,0");
		members = sb.toString();
		hm = new HashMap<String, Member>();
		sc = new Scanner(System.in);
	}

	public HashMap<String, Member> setMember() {
		st = new StringTokenizer(members,",");
		while(st.hasMoreTokens()) {
			member = new Member();
			member.setName(st.nextToken().trim());
			member.setId(st.nextToken().trim());
			member.setPw(st.nextToken().trim());
			member.setAge(Integer.parseInt(st.nextToken().trim()));
			member.setLevel(Integer.parseInt(st.nextToken().trim()));
			hm.put(member.getId(), member);
		}

		return hm;
	} //end set

	public Member memberJoin() {
		Member m = new Member();
		System.out.println("이름을 입력하세요");
		m.setName(sc.next());
		System.out.println("ID를 입력하세요");
		m.setId(sc.next());
		System.out.println("PW를 입력하세요");
		m.setPw(sc.next());
		System.out.println("나이를 입력하세요");
		m.setAge(sc.nextInt());
		System.out.println("등급을 입력하세요");
		m.setLevel(sc.nextInt());
		return m;

	}

	//end join

	public Member memberLogin(HashMap<String, Member> hm) {
		Member m = new Member();
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("PW를 입력하세요");
		String pw = sc.next();
		if(hm.containsKey(id)) { //키값이 존재하면
			if(id.equals(hm.get(id).getId()) &&   pw.equals(hm.get(id).getPw())      ) {
				System.out.println( "로그인 성공");
				m = hm.get(id);
			}
		}
		else {
			System.out.println("로그인 실패");
		}
		return m;
	} //end login

	public String memberDelete(HashMap<String, Member> hm) {
		
		String s = "삭제가 성공되었습니다.";
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("PW를 입력하세요");
		String pw = sc.next();
//		member = map.get(id);
//		if(member != null) {
//			hm.remove(id);
//			s = "삭제가 실패되었습니다.";
//			return s;
//		}
		if(hm.containsKey(id)) { //키 값이 존재하면
			if(id.equals(hm.get(id).getId()) &&   pw.equals(hm.get(id).getPw())      ) {
				hm.remove(id);
				return s;
			}
		}

		return null;
	} //delete
}

