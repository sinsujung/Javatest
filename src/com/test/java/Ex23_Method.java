package com.test.java;

public class Ex23_Method {
	
	public static void main(String[] args) {
	
		//Ex23_Method.java
		
		/*
		 
		 
		 	메소드 오버로딩, Method Overloading
		  	- 같은 이름의 메소드를 여러개 만드는 기술
		  	- 메소드의 인자 리스트를 다양한 형태로 구성해서 , 같은 이름의 메소드를 여러개 만드는 기술 
		  
		 	메소드 오버로딩 이유 ?
		 	- 성능 향상? > X
		 	- 개발자에게 도움 > O
		 	- 메소드 이름을 여러개 외우지 않아도 되게금 하나로 통일
		 
		 	메소드 오버로딩 구현 조건 가능
		 	1. 매개변수의 개수
		 	2. 매개변수의 자료형
		 	
		 	메소드 오버로딩 구현 조건 불가능
		 	1. 매개변수의 이름(함정카드~)
		 	2. 반환값의 자료형
		 	
		 	
		 	메소드를 여러개 선언할 예정!!
		 	1. public static void test() {} 			// O
		 	2. public static void test() {} 			// X. 1번이랑 구분 안됨
		 	3. public static void test(int n) {} 		// O 
		 	4. public static void test(int m) {}		// X. 3번이랑 구분 안됨
		 	5. public static void test(String s){}  	// O
		 	6. public static void test(int n, int m) {} // O
		 	7. public static int test() {}				// X. 1번이랑 구분 안됨
		 	
		 	
		 	
		 	메소드를 호출하기 !!  > 검증 !!
		 	test(); 				//1번
		 	test(10); 				//3번
		 	test("홍길동"); 			//5번
		 	test(10, 20);			//6번
		 	int result = test();	//7번
		 	
		 */

		drawLine();
		drawLine("*");
		
		
		System.out.println(100);
		System.out.println("문자열");
		
		
		
	}//main
	
	public static void println(int num) {
		
	}
	
	//public static void printlnString
	public static void test() {
		
	}
	
	public static void test(int n) {}

	
	
	//요구사항] 선을 그리는 메소드를 선언하시오.
	//
	
	public static void drawLine() {
		System.out.println("========================================");
	}
	
//	public static void drawLine() {
//		System.out.println("*****************************************");
//	}
	
	
	
	//메소드 오버로딩 : 똑같은 이름의 메소드를 만들어서 매개변수를 만든 것.
	public static void drawLine(String s) {
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	System.out.print(s);
	}	

}



























