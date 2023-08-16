
package com.test.question;

public class Q053 {

	public static void main(String[] args) {

		// 요구사항] 아래와 같이 출력하시오.
		// 조건] 구구단을 출력하시오

		// i=몇단인지,j는 몇을 곱할
		m1();
		
		m2();
		
	}

	private static void m2() {
		for (int j = 1; j < 10; j++) {
			for (int i = 6; i < 10; i++) {
				System.out.printf("%d x %d = %2d  ", i, j, i * j);
			}
			System.out.println();

		}
	}

	private static void m1() {
		for (int j = 1; j < 10; j++) {

			for (int i = 2; i < 6; i++) {
				System.out.printf("%d x %d = %2d  ", i, j, i * j);
			}
			System.out.println();
		}
			System.out.println();
	}
}
