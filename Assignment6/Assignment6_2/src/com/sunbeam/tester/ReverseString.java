package com.sunbeam.tester;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc =new Scanner(System.in);
		String name = sc.next();
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(name);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
	}

}
