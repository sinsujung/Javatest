package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		// 요구사항] 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		/*
		 조건]
		 	사원 -> 대리 -> 과장 -> 부장
		 	void position(String)
		 	void position(String, String)
		 	void position(String, String, String)
		 	void position(String, String, String, String)
		 */
		//메소드를 호출한다.(메소드 오버로딩)
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동","유재석","박명수");
		position("홍길동", "유재석", "박명수", "정형돈");

		
	}//main
	//메소드를 선언한다.
	//직급을 변수로 선언하고 printf를 사용하여 호출한다.
	public static void position(String name1) {
		String m1 = "사원";
		System.out.printf("%s: %s\n",m1, name1);
		System.out.println();
	}
	
	public static void position(String name1, String name2) {
		String m1 = "사원";
		String m2 = "대리";
		
		System.out.printf("%s: %s\n%s: %s\n",m1, name1, m2, name2);
		System.out.println();
	}
	
	public static void position(String name1, String name2, String name3) {
		String m1 = "사원";
		String m2 = "대리";
		String m3 = "과장";
		
		System.out.printf("%s: %s\n%s: %s\n%s: %s\n",m1, name1, m2, name2, m3, name3);
		System.out.println( );
	}
	public static void position(String name1, String name2, String name3, String name4) {
		String m1 = "사원";
		String m2 = "대리";
		String m3 = "과장";
		String m4 = "부장";
		//변수 x 바로 출력
		
		System.out.printf("%s: %s\n%s: %s\n%s: %s\n%s: %s\n",m1, name1, m2, name2, m3, name3, m4, name4);
		System.out.println( );
	}
	
}
