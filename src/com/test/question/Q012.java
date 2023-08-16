package com.test.question;

import java.util.Scanner;

public class Q012 {
	
	public static void main (String[] args ) {
	
		System.out.println("숫자를 입력하세요:" );
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result;
		
		
		result = getNumber(n);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
	}//main
	
	public static String getNumber(int n) {
		String result;
		result = (n % 2 == 0 ? "짝수" : "홀수");
		return result;
				
		
	}

}
