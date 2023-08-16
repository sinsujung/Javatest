package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
	//요구사항] 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		/*
		 
		  조건] 유효성 검사를 하시오.(영문자만 입력 가능)
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		//사용자로부터 문자를 받는다.
		System.out.print("문자: ");
		
		char letter = scan.nextLine().charAt(0);
		
		int alterSmall = 0;
		int alterBig = 0 ;
		
		//문자를 숫자로 바꿔서 계산한 뒤 다시 char로 변경하여 변수에 넣음.
		
		alterSmall = (char)((int)letter + 32);
		alterBig = (char)((int)letter - 32);
		
		//if문을 사용해 대문자를 입력하면 소문자로, 소문자로 입력하면 대문자로 바꿔주도록 한다.
		if(letter >= 'A' && letter <= 'Z') {
			System.out.printf("%c의 소문자는 %c입니다.\n",letter, alterSmall);
		} else if (letter >= 'a' && letter <= 'z') {
			System.out.printf("%c의 대문자는 %c입니다.\n,", letter, alterBig);
		} else {
		System.out.println("영문자만 입력하시오.");
		}
		
	}//main
}
