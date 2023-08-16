package com.test.java;

import java.util.Scanner;

public class Ex30_for {

	public static void main(String[] args) {

		// Ex30_for.java

		//m1();
		//m2();
		// m3();
		 //m4();
		// q39();
		 //q41();
		 //q42();
		//q43();
		
		m5();
		//다중 반복문 > 단일 반복문  
		 
	}// main
	private static void m5() {
		
		// 별찍기(5x5)
		
		int n = 1; 
		
		for(int i=0; i<5; i ++) { //행 만들기
			for(int j=0; j<5; j ++) { //열 만들기
				
				System.out.print("*");
				//System.out.printf("%3d", n);
				//n++;
				
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i ++) { //행 만들기
			for(int j=i; j<5; j ++) { //열 만들기
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i ++) { //행 만들기
			for(int j=0; j<=i; j ++) { //열 만들기
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	private static void q43() {
		//최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		//숫자입력: 273645281
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("숫자 입력: ");
		//int num = scan.nextInt();
		
		int sum = 0;
		int oddSum =0 , evenSum = 0;
		int num = 273645281;//27364528.1
		
		for (;;) {

			//System.out.println(num % 10);
			
			if(num % 10 % 2 ==0) {
				evenSum += num % 10;
			}else {
				oddSum += num % 10;
			}
			
			sum += num % 10 ;
			num = num / 10 ;
			
			if(num == 0) {
				break;
			}
		}
		
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(sum);
	}
		
		
	private static void q42() {
		//서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		
		int year = 2023;
		int month = 7 ;
		int date = 14;
		
		int sum = 0;//누적 변수(총 며칠째)
		String day = ""; //요일
		
		
		//1. 1년 1월  1일 ~ 2022년 12월 31일
		for (int i=1; i<year; i++) {
			
			sum += 365;
			
			if(isLeafYear(i)) {
				sum++; //366
			}
		}
		
		//2. 2023년 1월 1일 ~ 2023년 6월 30일 
		for(int i = 1; i < month; i ++) {
			sum += getMaxDate(year, month); 
		}
		
		//3. 2023년 7월 1일 ~ 2023년 7월 25일
		
		sum += date;
		
		//4. 검증 및 요일 구하기
		day = getDay(sum);
		
		System.out.printf("2023년 7월 25일은 %d일째 되는 날이고 %s요일입니다.\n", sum, day);

		
		
	}
	
	private static String getDay(int sum) {
		if (sum % 7 == 1) {
			return "월";
		} else if (sum % 7 == 2) {
			return "화";
		} else if (sum % 7 == 2) {
			return "수";
		} else if (sum % 7 == 2) {
			return "목";
		} else if (sum % 7 == 2) {
			return "금";
		} else if (sum % 7 == 2) {
			return "토";
		} else if (sum % 7 == 2) {
			return "일";
		}
		return null;
	}
	private static int getMaxDate(int year, int month) {

		switch( month) {
		case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return isLeafYear(year) ? 29 : 28 ;
		}
		
		return 0;
	}
	//메소드 이름 패턴
	//1. setXXX > 값전달
	//2. getXXX > 값가져오는
	//3. isXXX > 불리언값으로 가져올 때
	
	private static boolean isLeafYear(int year) {
	
		if(year % 4 == 0) {
			
			if ( year % 100 == 0) {
				
				if (year % 400 == 0) {
					return true ;
				}else {
					return true;
				}
			}else {
				return true;
			}
		} else { 
			return false;
		}
	}
	private static void q41() {
		
		//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 
		//	+ 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22
		//	+ 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 + 32 + 33 + 34
		//	+ 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43 + 44 + 45 = 1035
		int sum = 0;
		
		for(int i=1; ; i++) {
			
			sum += i;
			
			System.out.printf("%d +", i);
			
			if(sum > 1000) {
				break;
			}
			
		}
		
		System.out.println("=" + sum);
	}
	
	private static void q39() {
		
		Scanner scan = new Scanner(System.in);
		
		int begin = 0, end = 0;
		int sum = 0; //누적변수
		
		System.out.println("시작 숫자: ");
		begin = scan.nextInt();
		
		System.out.println("종료 숫자: ");
		end = scan.nextInt();
		
		for(int i=begin; i<=end; i++) {
			sum += i;
			if (i != end) {
				System.out.printf("%d +",i);
			}else {
				System.out.println(i);
			}			
			System.out.print(i);
		}
	}
		

	private static void m4() {
	
		//루프 > 분기문 개입(break, continue)
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				//if(i==5) {
				//if(j==5) {
				//if(i ==5 && j==5) {
				if(i ==5 || j==5) {
					break;//자신이 포함된 루프를 탈출한다.(j  루프 탈출)
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
	}
		
	private static void m3() {
		
		//쌍용 교육 센터
		//- 강의실(1강의실 ~ 6강의실)
		//- 학생들(30명)
		
		for (int i=1; i<=6; i++) {//강의실
			
			for(int j=1; j<=30; j++) {//학생
				
				System.out.printf("%d강의실 %d번 학생\n"
									, i, j);
			}
		}
	}
	private static void m2() {
		
		//구구단(2단~9단)
		
		for(int j=2; j<=9; j++) {

			System.out.println("==========");
			System.out.printf("%d단\n", j);
			System.out.println("==========");
		
			for(int i=1; i<=9; i++) {

				System.out.printf("%d x %d = %2d\n"
									, j, i, j * i);

			}
			System.out.println();
		}
	}
	
	//K&R
	public static void test() {
		
	}
	public static void test2() 
	{
		
	}
		
	
	//Allman
	private static void m1() {

		// 모든 제어문끼리는 중첩이 가능하다.

		// 중첩된 반복문
		// 2중 for문

		// 루프 변수 > i

		/*
		 
		  	2중 for문
		  	-반복문을 중첩한디ㅏ. 
		  	
		  	연습할 것!!
		 
		 */
		// ctrl + shift + f
//		for (int i = 0; i < 10; i++) {
//
//			for (int j = 0; j < 10; j++) {
//
//				// System.out.println("실행문");//10회 실행
//				System.out.printf("i: %d, j: %d\n", i, j);

//			}
//		}
		
		
		//3중 for문
		for(int i=0; i<24; i++) { //대회전(시침)
			
			for(int j=0; j<60; j++) { //중회전(분침)
				
				for(int k=0; k<60; k++) { //소회전(초침)
					
					//System.out.println("실행문");
					
					System.out.printf("i: %d, j: %d, k: %d\n", i, j , k);
				}
			}
		}
	}
}
