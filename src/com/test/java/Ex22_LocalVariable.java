package com.test.java;

public class Ex22_LocalVariable {
	
	//멤버 변수
	int b;

	public static void main(String[] args) {
		
		//Ex22_LocalVariable.java
		
		//지역 변수
		int a;
		/*
		
			자바 변수의 종류
			1. 멤버 변수, Member Variable
				- 클래스 수업
				
			2. 지역 변수, Local Variable
				- 여태까지 수업한 변수
				
			지역 변수
			- 메소드 내에서 선언한 변수
			- 변수의 선언 위치(***)
		
			지역 변수의 생명주기 , Life Cycle
			- 언제 태어나서(메모리에 생성) ~ 언제 죽는지(메모리에 소멸)
			- 생성 > 변수 선언문이 실행되는 순간
			- 소멸 > 변수 선언문이 포함된 자신의 영역에서 제어가 벗어나는 순간

			
			지역 변수의 영역(Scope)
			- 선언문이 포함된 블럭({})
		*/
		
		int c;// 모든 변수는 실행하기 전에는 생성x
		
		String name = "홍길동";
		//String name = "아무개";
		
		m1();
//		int age = 10;
//		System.out.println(age);
		
		//*** 지역 변수는 초기화를 하지 않으면 사용이 불가능하다.
		int num;//지역변수를 생성한 직후는 null의 상태, null은 존재하지 않는 상태, 따라서 아무 것도 할 수가 없다.
		
		//int result = num + 10;// 아무것도 없는 것과 null은 다르다. (연산불가)
		
		
		//The local variable num may not have been initialized
		//System.out.println(num);

		
	}//main > 이 메서드가 끝날 때 안에서 쓰던 모든 지역 변수 소멸
	
	public static void m2 (String gender) {
		
		//매개변수 == 지역변수
		//String gender;
		
	}
	
	//메소드가 바뀌면 같은 변수 사용 가능
	
	public static void m1 () {
		
		String name = "아무개";
		int age = 20;
		System.out.println(age);
		
	}
}




















