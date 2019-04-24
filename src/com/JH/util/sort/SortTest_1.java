package com.JH.util.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest_1 {

	public static void main(String[] args) {
		int [] ar = new int [6];
		Random r = new Random();
		for(int i=0; i<ar.length; i++) {
			ar[i] = r.nextInt(45)+1;
			
			System.out.print(ar[i]+"\t");
		}
		
		System.out.println();
		Arrays.sort(ar);
		
		for(int i =0; i<ar.length; i++){
			System.out.print(ar[i]+"\t");
		}
		
		
		
	}

}
