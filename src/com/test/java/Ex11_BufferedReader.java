package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11_BufferedReader {

	public static void main(String[] args) throws Exception {
		
		//Ex11_BufferedReader.java
		
		//BufferedReader 클래스
		
		//단축키 > Ctrl  +  Shift + O
		
		//int a ;
		
		//reader > 콘솔 입력 도구
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("문자 입력: ");
//		
//		int code = reader.read();
//		System.out.printf("%c\n",code);
//		
//		String line = reader.readLine();
//		System.out.println(line);
//		
//		System.out.println("이름 입력 : ");
		
		//readLine() : 입력 버퍼에서 처음부터 ~엔터(\r\n)를 만나기 전가지 모두 읽어오는 메소드
		//- 엔터는 자동으로 삭제
		//String name = reader.readLine();
		
		//System.out.printf("안녕하세요. %s님\n", name);
		
		
		//Wrapper Class(Utility Class)
		//- 원시형 데이터를 도와주는 기능을 제공하는 클래스
		//byte > Byte 클래스
		//short> Short 클래스
		//int > Integer 클래스 **
		//long > Long 클래스 **
		//float > Float 클래스
		//double > Double 클래스 **
		//boolean > Boolean 클래스
		//char > Character 클래스
		//System.out.print("숫자 입력");
		
		//String num = reader.readLine(); //100 > "100"
		
		//int num2 = Integer.parseInt(num); // "100" > 100
		
		//double num2 = Double.parseDouble(num);
		//System.out.println(num2 * 2); //"홍길동" * 2
		
		//요구사항] 숫자 2개 입력 > + 연산 > 연산과정과 결과를 모두 출력
		
		//숫자1: 5
		//숫자2: 3
		//5 + 3 = 8
		
//		System.out.println("첫번째 숫자 입력해줘~ : "); //"5"
//		String input1 = reader.readLine();
//		
//		System.out.println("두번째 숫자 입력해줘~ : ");
//		String input2 = reader.readLine();//"3"
//		
//		int n1 = Integer.parseInt(input1); // "5" > 5
//		int n2 = Integer.parseInt(input2); //"3" > 3
//		
//		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
//		

		System.out.println("숫자: ");
		
		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		
		// java.lang.ArithmeticException: / by zero
		//피제수 / 제수
		//제수는 0이 될 수 없다.
		System.out.println(100 / num);
		
		/*
		
			에러, Error
			- 오류, 버그(Bug), 예외(Exception) 등 ..
			
			1. 컴파일 에러
				- 컴파일 작업 중에 발생하는 에러
				- 컴파일러가 발견!!!!!!!!!(javac.exe) > 번역하다가.. > 문법이 틀려서!!!!!!
				- 발생!! > 컴파일 작업 중단 > 프로그램 생성 분가!! > 반드시 해결
				- 이클립스 연동 > 빨간 밑줄
				- 난이도 가장 낮음 > 발견이 쉽다. > 컴파일러가 알려줌 > 고치기도 쉬움
				- 원인: 주로 오타!!
				
				2. 런타임 에러
					- 런타임(Runtime) > 프로그램 실행 중..
					- 컴파일 작업 중에는 에러가 없음 > 실행 중에 발생하는 에러
					- 문법에는 오류가 없는데 .. 다른 원인으로 발생하는 에러
					- 예외(Exception)	
					- 난이도 중간 > 발견 O , 발견 X(발견 할 수도 못할 수도) > 복불복
					
					- 충분히 사전에 테스트
					- 게임 출시 > 클로즈드 알파, 클로즈드 베타 > 오픈 알파, 오픈 베타
					
			
			
			
			
			3. 논리 에러
				- 컴파일 성공 !! + 실행 성공 !! > 결과가 이상 ;;
				- 난이도 최상 > 발견 최악 + 수정 최악
			
			
		
		*/
		
		
	}//main
}


















