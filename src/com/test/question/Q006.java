package com.test.question;

import java.util.Scanner;

public class Q006 {
	
	public static void main(String[] args) {
		
		System.out.println("한달 수입이 얼마인가요 ? : ");
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int tax = input / 1000 * 33;
		
		System.out.printf("세후 금액(원): %,d원\n세금(원):%,d원", input - tax, tax);
	}

}
