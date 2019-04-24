package com.JH.util.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortTest_3 {
	
	public static void sort(List<Comparable<Object>> ar ) {
		int num = ar.get(0).compareTo(ar.get(1));
		if(num>0) {
			
		}
	}
	public static void main(String[] args) {
		Member m1 = new Member("iu", 26);
		Member m2 = new Member("iu", 26);
		System.out.println(m1.equals(m2));

		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
	
	}




}
