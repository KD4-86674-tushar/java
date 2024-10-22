package com.sunbeam.exception.tester;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String cal = sc.next();

		try {

			if (cal.length() > 80) {
				throw new Exception("The strings is too long ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
