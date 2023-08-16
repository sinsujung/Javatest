package com.test.question;

import java.util.Scanner;

public class Q013 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		String result = test(kor, eng, math) ;
		
		System.out.println(result);
		
	}//main
	
	public static String test(int kor, int eng, int math) {
		
		int average ;
		
		average = (kor + eng + math)/3;
		
		String result = "" ;
		
		result = average >= 60 && kor >= 40 && eng >= 40 && math >= 40 ? "합격입니다." : "불합격입니다." ;
		//3항 연산자 형식이 다른 사용해서 나눠서 작성
		
		return result;
	}
	
}
