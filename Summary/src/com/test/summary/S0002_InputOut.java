package com.test.summary;

import java.util.Scanner;

public class S0002_InputOut {

	public static void main(String[] args) {
		
		// 콘솔 출력
		System.out.print("기본 출력");
		
		System.out.println("라인 출력");
		
		System.out.printf("포맷 출력");
		
		//형식 문자(%s, %d, %c, %b, %f)
		System.out.printf("%,10.1f", 123456.789);

		//콘솔 입력
		Scanner scan = new Scanner(System.in);
		
		//문자열 입력
		System.out.println("문자열 입력: ");
		String input = scan.nextLine();
		
		//숫자 입력
		System.out.println("숫자 입력: ");
		int num = scan.nextInt();
	}
}





























