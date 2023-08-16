package com.test.question;

import java.util.Scanner;

public class Q011 {
	public static void main(String[] args) {
		
		System.out.println("첫번째 숫자: ");
		Scanner scan1 = new Scanner(System.in);
		int n1 = scan1.nextInt();
		System.out.println("두번째 숫자: ");
		Scanner scan2 = new Scanner(System.in);
		int n2 = scan2.nextInt();
		
		String result;
		
		result = add(n1, n2); 
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);
	}//main
	
	public static String add(int n1, int n2) {
		int result = n1 + n2 ;
		String a = n1 + " + " + n2 + " = " + result;
		return a ;
	}
	
	public static String subtract(int n1, int n2) {
		int result = n1 - n2 ;
		String a = n1 + " - " + n2 + " = " + result;
		return a;
	}
	public static String multiply(int n1, int n2) {
		int result = n1 * n2 ;
		String a = n1 + " * " + n2 + " = " + result;
		return a;
	}
	public static String divide(int n1, int n2) {
		double result = (double)n1 / n2 ;
		String a = String.format("%d / %d = %.1f", n1, n2, result);
		return a;//format > printf(); 에서 f의 약자와 같은 것 
		
	}
	public static String mod(int n1, int n2) {
		int result = n1 % n2 ;
		String a = n1 + " % " + n2 + " = " + result;
		return a;
	}
}