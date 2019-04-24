package com.JH.member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberView {
	public void view(String str) {
		System.out.println(str);
	}

	public void view(Member m) {
		System.out.println("이름 : " +m.getName());
		System.out.println("ID : " + m.getId());
		System.out.println("PW : " +m.getPw());
		System.out.println("나이 : " +m.getAge());
		System.out.println("등급 : " +m.getLevel());
		System.out.println("================");
	}

	public void view(HashMap<String, Member> hm) {
		Iterator<String> it2 = hm.keySet().iterator(); 
		while(it2.hasNext()) {
			String key = it2.next();
			Member value = hm.get(key);
			System.out.println("이름 : " +value.getName());
			System.out.println("ID : " + value.getId());
			System.out.println("PW : " +value.getPw());
			System.out.println("나이 : " +value.getAge());
			System.out.println("등급 : " +value.getLevel());
			System.out.println("================");
		}

	}

}
