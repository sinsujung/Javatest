package com.test.question;

public class Q016 {

	public static void main(String[] args) {
		
		//요구사항] 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		/*조건] 
			void sum(int)
			void sum(int, int)
			void sum(int, int, int)
			void sum(int, int, int, int)
			void sum(int, int, int, int ,int)
		
		*/
		//sum 메소드를 호출한다.(메소드 오버로딩)
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);

	}//main
	
	//메서드를 선언한다.
	public static void sum (int a) {
		System.out.printf("%d = %d\n", a, a);
	}
	public static void sum (int a, int b) {
		System.out.printf("%d + %d = %d\n",a, b, a + b);
	}
	public static void sum (int a, int b, int c) {
		System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
	}
		public static void sum (int a, int b, int c, int d) {
			System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, a + b + c + d);
		}
			public static void sum (int a, int b, int c, int d, int e) {
				System.out.printf("%d + %d + %d + %d + %d = %d\n", a, b, c, d, e, a + b + c + d + e);
			}
}//다른 분들이랑 같음. 
