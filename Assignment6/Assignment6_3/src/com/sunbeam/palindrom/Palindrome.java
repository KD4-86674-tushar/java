package com.sunbeam.palindrom;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter String 1");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.next();

		StringBuilder input1 = new StringBuilder();

		input1.append(string1);

		StringBuilder xyz = input1.reverse();
		System.out.println(xyz);

		if (string1.equals(xyz.toString())) {

			System.out.println("Palindrom");

		} else {
			System.out.println("Not Palindrom");

		}

	}

}
