package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex50_final {
	
	public static void main(String[] args) {
		
		//Ex50_final.java
		/*
		 
		 	final 키워드
		 	- 한번 결정하면 바꿀 수 없다.
		 	- 안정성 높음
		 	
		 	
		 	1. 변수 적용(지역 변수, 멤버 변수)
		 		- 초기화 이후 값을 변경할 수 없다.
		 		- 상수

		 	2. 메소드 적용
		 		- 상속
				- 오버라이드 금지!!> 부모가 만든 메소드를 재정의하는 것
				- 부모 메소드 > 수정하지못하게
				
		 	3. 클래스 적용
		 		- 상속
		 		- 부모 클래스 > 수정하지 못하게
		 		
		 */
		
		//지역 변수
		int a = 10;
		a = 20;
		a = 30;
		
		//final 변수 = 상수
		final int b = 10;
		//b = 20;//The final local variable b cannot be assigned.
		
		//비권장 > 변수처럼 보여서..
		final int c;
		c = 10;
		//c = 20;
		
		//권장 > 선언과 초기화
		final int d = 10;
		
		final int E = 10;
		
		Test t = new Test();
		t.a = 20;
		//t.b = 30;//The final field Test.b cannot be assigned
		
		test(100);
		
		
		
		System.out.println(Calendar.YEAR); // 캘린더 상수
		//Calendar.YEAR = 2; //The final field Calendar.YEAR cannot be assigned
		
		
		int gender ;
		
		gender = 1;
		gender = 2;
		
		int male = 1;
		int female = 2;
		
		male = 2;// > 큰일
		
		final int MALE = 1;
		final int FEMALE = 2;
		
		//Gender.MALE;
		
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		
	}//main

	public static void test(final int a) {
		System.out.println(a);
		//a = 200;
		
	}
}

class Test {
	public int a = 10;
	public final int b = 20; //멤버 변수
}


//남자(1), 여자(2) > 열거값
class Gender {

	public final static int MALE = 1;
	public final static int FEMALE = 2;
	
}







class FinalParent {

	//부모 클래스 설계..
	//- test() > 나중에 상속받은 자식 클래스가 이 test()메소드를 재정의하면 안될 것 같다.
	
	final public void test()	{
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent{
	
	//Cannot override the final method from FinalParent
//	@Override
//	public void test() {
//		System.out.println("자식 메소드");
//	}
}


//부모 클래스 설계 .. > 상속 불가능하게
final class FinalMember {
	
}

//The type FinalUser cannot subclass the final class FinalMember
//class FinalUser extends FinalMember {
//	
//}










