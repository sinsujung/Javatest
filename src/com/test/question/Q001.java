package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		System.out.println("태어난 년도를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int year = 2024;
		
		System.out.println("나이:" + (year - input));
		
		
	}
}
