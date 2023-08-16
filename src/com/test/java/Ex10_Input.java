package com.test.java;

public class Ex10_Input {
	public static void main(String[] args) throws Exception {
		
		//Ex10_Input.java
		
		/*
		
			콘솔 출력 > 모니터
			1. System.out.print()
			2. System.out.println()
			3. System.out.printf()
			
			콘솔 입력 > 키보드
			1. System.in.read() //불편함
			2. bufferedReader 클래스
			3. Scanner 클래스
			
		
		*/
		
		//요구사항] 사용자에게 문자 1개를 입력받아 > 화면에 출력하시오.
		
		//1. 안내 메시지 출력
		//2. 키 입력
		//3. 키를 화면에 출력
		
		//1.
		System.out.println("문자 입력: ");
		
		//2.(사용하려면 throw Exception)
		// - 입력 대기 상태 > 블럭 걸렸다.
		// - 사용자의 키 입력을 기다리고 있는 중..
		// - 콘솔 > 키 입력 완료 > 엔터 입력
		
		//read() 메소드 1회 > 문자 1개 입력
		//a만 입력 했을때 97, 13, 10 이 나오는 이유
		// - 엔터를 입력했기 때문에 \r\n이 입력됨.
		// - \r = 13, \n = 10
		
		int code = System.in.read(); //문자 코드
		
		System.out.println("출력:" + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력:" + code);
		System.out.printf("출력: %c\n", code);

		code = System.in.read();
		System.out.println("출력:" + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력:" + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력:" + code);
		System.out.printf("출력: %c\n", code);
		
		
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}
}















