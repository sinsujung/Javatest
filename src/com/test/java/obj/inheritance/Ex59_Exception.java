package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {

	public static void main(String[] args) {
		
		//Ex59_Exception.java
		
		
		/*
		 
		 	예외, Exception
		 	- 런타임 오류
		 	- 컴파일 발견(X) > 실행 중 발견(O) //런타임에러
		 	- 개발자가 미리 예측할 수 있다(경험기반) or 예측을 못하는 경우
			
			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용(조건문)
				
			2. 전용 방식
		 		- try catch finally 문 사용
		 		
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		try {
		//m5();//Unhandled exception type Exception > 이거 뜨면 try catch로 묶어야함 
			//또는 메인 메서드에 ㅇㅖ외 미루기(throws Exception)를 함
			//하지만 메인 메서드에서 예외를 묶으면 뻑이남 절대로 메인메서드까지 미루지 말 것
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		m6();
		
		try {
			int num = 0;
			System.out.println(100/num);
		} catch (Exception e) {
			
		}// catch절 비워두지 말기!! 안적으면 에러났을 때 왜 에러 났는지 모르니까
		
	}//main

	private static void m6() {

		// 예외 던지기
		
		//요구사항] 숫자 입력 > 처리
		//조건] 반드시 짝수만 입력
		//			홀수 입력 > 에러 처리
		
		int num = 5;
		
		if(num % 2 == 0) {
			//비즈니스 영역
			System.out.println("업무를 진행합니다.");
		} else {
			//예외 처리코드
			System.out.println("예외처리..");
		}
		
		//try 구현
		try {
			
			if(num % 2 == 1) {
			throw new Exception("홀수 입력"); // 강제로 에러를 발생시키는 것/ Exception 안에 에러 상황 적으면 e.getMessage();
			}
			System.out.println("업무를 진행합니다.");
		} catch (Exception e) {
			//예외 처리코드
			System.out.println("예외처리..");
			System.out.println(e.getMessage());// 무슨 에러 났는지 알릴 수 있음
		}
		
		
	}

	private static void m5() throws Exception {
		
		// throws Exception > 예외 미루기
		
		
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//Unhandled exception type IOException//에러 날 수도 있으니까 예외처리 좀 해줘라는 뜻
//		try {
//			String input = reader.readLine();//
//		} catch (Exception e) {
//			
//		}
//		
		String input = reader.readLine();
	}

	private static void m4() {
			//0으로 나누기 > ArithmeticException
			try {//공던지는 사람
				int num = 10;
				System.out.println(100/ num); //에러가 나면 'new ArithmeticException()'(상황에 적합한) 객체를 만들어서 catch 쪽으로 던짐
			
			//배열 첨자 > ArrayIndexOutOfBoundsException
				int[] nums = new int[3];
				nums[0] = 10;
			
			//널참조 > NullPointerException
				Scanner scan = null;
				scan.nextLine();
				
			} catch(ArithmeticException e) { // 위에서 던진 객체랑 자료형이 같은 catch가 받음// 던진 객체를 받는 순간 예외처리 종료
				
				System.out.println("0으로 나누기");
				
			} catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("배열 첨자");
				
			} catch(NullPointerException e) {
				
				System.out.println("널참조");
			
				// 순서 상 Exception e을 맨 마지막에 둬야 처음부터 오류를 얘가 안잡음
			}catch (Exception e) {// 위에 자료형이 같은 catch가 없으면 얘가 잡음 (업캐스팅)// 모든 에러상황의 부모
				System.out.println("예외 처리");//??
			}
}
	

	private static void m3() {
	
		//0으로 나누기 > ArithmeticException
		try {
			int num = 10;
			System.err.println(100/ num);
		} catch(Exception e) {
			System.out.println("0으로 나누기");
		}
		
		
		//배열 첨자 > ArrayIndexOutOfBoundsException
		try {
			int[] nums = new int[3];
			nums[0] = 10;
		} catch (Exception e) {
			System.out.println("배열 첨자");
		}
		
		//널참조 > NullPointerException
		try {
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("배열 첨자");
		}
		
	}

	private static void m2() {
		int num = 0;
		
		try {
			
			//test.txt 파일 열기
			
			//비즈니스 영역
			System.out.println(100/num);
			
			//test.txt 파일 닫기 >> 예외상황에 상관없이 파일을 닫는 상황을 제공할 때 finally 사용
			
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			//? > 마무리 영역 > 에러가 나던 안나던 무조건 실행되는 블럭 > 뒷수습
			//- ㅇㅖ외와 상관없이 항상 실행해야 하는 코드 블럭 //써도 안써도 됌(finally) 안쓰는 경우 많다
			System.out.println("마지막");
			//test.txt 파일 닫기
		}
	}

	private static void m1() {
		
		//요구사항] 숫자를 입력받아 연산을 하시오.
		Scanner scan =new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt();
		
	//ㅇㅖ외처리. 고전적인 방식
		
	/*
	 
	 	if(조건) {
	 		//참 > 실행
	 	} else {
	 		거짓 > 실행
		}
	
	 */
		
		//권장
		if(num !=0) {
			//비즈니스 코드(=업무코드) > 원래 목적!!
		System.out.printf("100 / %d = %d\n", num, 100/num);
		}else {
			//ㅇㅖ외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		
		//비권장 > 가독성 때문에
		if(num == 0) {
			//ㅇㅖ외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}else {
			//비즈니스 코드(=업무코드) > 원래 목적!!
			System.out.printf("100 / %d = %d\n", num, 100/num);
		}
		
		
		//if문 vs try문
		//- if문: 사전에 미리 검사를 해서 사고가 안나게 처리
		//- try문: 에러나던말던 일단 실행하고 감시 > 사고 터지면 그제서야 뒷처리
		
		
		
		// try 영역이 하는 일 > 감시!!(CCTV)역할 > 예외가 발생하는지 감시!
		// 묻지도 따지지도 않고 무조건 try로 들어감 try가 실행되면 catch 실행 안하고 빠져나옴
		// try 영역에서 에러가 나면 try에서 하던일 멈추고 catch 영역으로 들어감
		try {
			System.out.println(1);
		System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println("0을 입력하면 안됩니다.");		
			
			//Exception e
			//- 예외 객체
			//- 예외의 상황을 전달. 오류시 상황 전달
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
		
		System.out.println("종료");
			
		
	}
	
}//class

















