package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		System.out.println("첫 번재 숫자를 입력하세요 : ");
		
		Scanner scan1 = new Scanner(System.in);
		
		double first = scan1.nextInt();
		
		System.out.println("두 번재 숫자를 입력하세요 : ");
		
		Scanner scan2 = new Scanner(System.in);
		
		double second = scan2.nextInt();
		
		System.out.printf("%f + %f = %,.1f\n", first, second, first + second);
		System.out.printf("%f - %f = %,.1f\n", first, second, first - second);
		System.out.printf("%f * %f = %,.1f\n", first, second, first * second);
		System.out.printf("%f / %f = %,.1f\n", first, second, first / second);
		System.out.printf("%f %% %f = %,.1f\n", first, second, first % second);
		
		
	}
}
