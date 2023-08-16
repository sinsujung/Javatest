package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
	
		System.out.println("소문자를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		int code = (int)input.charAt(0);
		
		
		System.out.printf("소문자 '%c'의 대문자는 %s입니다.\n",input, code );
		
	}

}
