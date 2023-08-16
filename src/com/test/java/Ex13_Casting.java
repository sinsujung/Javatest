package com.test.java;

public class Ex13_Casting {

	public static void main(String[] args) {
		
		//Ex13_Casting.java
		
		/*
		 
		 	형변환, (자료)형변환
		 	- Casting, Data Type Casting
		 	- 하나의 자료형을 또 다른 자료형으로 변환하는 작업
		 	- 코드 작성을 유연하게 하기 위해서 사용
		 	- int > double
		 	- float > short
		 	
		 	1. 암시적 형변환(자동 타입 변환)
		 		- 큰형 = 작은형
		 		- 100% 안전한 작업
		 		- 복사를 했을 때 원본과 항상 동일한 값 복사
		 	2. 명시적 형변환(강제 타입 변환)
		 		- 작은형 = 큰형
		 		- 경우에 따라 다르다.
		 		- 늘 신경써서 관리할 것!!
		 		
			명시적 형변환 시 발생하는 데이터가 넘치는 현상 > 오버플로우(Overflow)
			1. 위로 넘치는 현상 > Overflow
			2. 아래로 넘치는 현상 > Underflow
			1+2. Overflow
			
			*** 오버플로우가 발생할 만한 상황을 미리 예측해서 관리가 필요하다.




		*/
		
		byte a ; //원본(1byte)
		short b ; //복사본(2byte)
		
		//a= 10;
		a = Byte.MAX_VALUE;
		
		//암시적 형변환
		//short(2) = byte(1)
		//(자료형) : 형변환 연산자
		
		b = a;
		//b = (short)a;
		
		System.out.println(b);
		
		byte c = 10;
		long d ;
		
		//큰형(8) = 작은형(1)
		//암시적 형변환
		d = c; //d = (long)c;
		
		System.out.println(d);
		
		
		
		short e; // 원본
		byte f; // 복사본
		
		e = 552 ;
		
		//작은형(1) = 큰형(2)
		f = (byte)e;
				
		System.out.println(f); //-24
		
		
		//은행 계좌
		int g; //복사본
		long h; //원본
		
		h = 3000000000L;
		
		g = (int)h;
		
		System.out.println("이체 결과: " + g);
		
		
		
		
		
	}//main
}















