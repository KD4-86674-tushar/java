package com.sunbeam.tester;

import java.util.Scanner;

public class StringTester {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc =new Scanner(System.in);
		String name = sc.next();
		String ntr="";
		char ch;
		for(int i=0; i<name.length(); i++) {
			ch = name.charAt(i);
			ntr = ch+ntr;
			
			
		}
		System.out.println(ntr);
	}

}
