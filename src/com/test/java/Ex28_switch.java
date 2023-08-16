package com.test.java;

import java.util.Scanner;

public class Ex28_switch {

	public static void main(String[] args) {
		
		//Ex28_switch.java
		
		/*
		 
		 	switch, switch case문
		 	- 조건이 boolean이 아닌 일반 값이다. > 정수, 문자열, 열거형(enum)
		 		>> 실수, char가 오면 오류남.
		 	- if문보다 활용도가 떨어진다.
		 	- if문보다 가독성이 높다.
		 	
		 	//case는 원하는 만큼 , default는 맨 끝(생략가능)
		 	switch (조건){
		 		case1 값:
		 			문장;
		 			break;
		 		[case2 값:
		 			문장;
		 			break;
		 		case3 값:
		 			문장;
		 			break;]x N
		 		[default:
		 			문장;
		 			break;]
		 			
		 	}
		 	
		  
		 */
		//m1();
		//m2();
		//m3();
		m4();
		//m5();
	}//main
	
	private static void m4() {
		Scanner scan = new Scanner(System.in);
		//nextLine() vs 나머지()
		//- nextLine()
		// - 입력된 버퍼에서 개행문자를 만나기 전까지 읽기
		// - 위의 개행문자를 버퍼에서 제거한다.
		// - nextXXX()
		// - 입력된 버퍼에서 개행문자를 만나기 전가지 읽기
		//- 위의 개행문자를 버퍼에서 제거하지 않는다.
		
		//1. 문자열 입력
		//2. 숫자 입력
		
		System.out.println("숫자: ");
		int num = scan.nextInt();
		System.out.println(num);
		
		scan.skip("\r\n");
		System.out.println("문자열: ");
		String txt = scan.nextLine();
		System.out.println(txt);
		
		System.out.println("종료 ");
		
	}
	
	private static void m3() {
		
		//요구사항] 사용자가 월을 입력 > 해당월의 마지막 일?
		
		int lastDay = 0 ; //마지막일
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 : ");
		
		int month = scan.nextInt();
		
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				lastDay = 31;
				break;
			case 2:
				lastDay = 28;
				break;
			case 4, 6, 9, 11:
				lastDay = 30;
				break;
			default :
				System.out.println("잘못 입력 하였습니다.");
				break;
		}
		System.out.printf("입력하신 %d월의 마지막 날짜에는 %d일 입니다.",month, lastDay);
		
	}
	
	
	private static void m2 () {
		//요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("=========");
		System.out.println("  자판기  ");
		System.out.println("=========");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("----------");
		System.out.print("선택(번호입력): ");
		
		int input = scan.nextInt();
		
		
		// 값 : > Label(표시판)
		
		switch (input) {
			case 1 :
				//System.out.println("700원 입니다.");
				//break;
			case 2 :
				System.out.println("600원 입니다.");
				break;
			case 3 :
				System.out.println("500원 입니다.");
				break;
				
		}
		
	}
	private static void m1() {
		
		//1 > "하나"
		//2 > "둘"
		//3 > "셋"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("하나");
		} else if (num ==2) {
			System.out.println("둘");
		} else if(num == 3) {
			System.out.println("셋");
		}
		//continue; 나 break; 는 다른 구문들에 기생함
		switch (num) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("잘못된 선택");
			break;
		}
	
	}
}





















