package com.test.question;

public class Q018 {

	public static void main(String[] args) {

		// 요구사항] 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		/*
		 * 조건 ] int positive(int) int positive(int, int) int positive(int, int, int) int
		 * positive(int, int, int, int) int positive(int, int, int, int, int)
		 */
		// 변수 count를 선언하고,
		int count = 0;
		// 매개변수에 숫자를 넣어서 positive 메소드를 호출하여 count의 값을 구한다.
		count = positive(10);
		System.out.printf("양수: %d\n", count);

		count = positive(10, 20);
		System.out.printf("양수: %d\n", count);

		count = positive(10, 20, -30);
		System.out.printf("양수: %d\n", count);

		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d\n", count);

		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d\n", count);

	}// main
		// 지역변수 count를 선언하고 3항 연산자를 통해 count의 값을 구하고 return.

	public static int positive(int num1) {

		int count = 0;

		count += (num1 > 0) ? 1 : 0;

		return count;

	}

	public static int positive(int num1, int num2) {
		int count = 0;

		count += (num1 > 0) ? 1 : 0;
		count += (num2 > 0) ? 1 : 0;

		return count;
	}

	public static int positive(int num1, int num2, int num3) {
		int count = 0;

		count += (num1 > 0) ? 1 : 0;
		count += (num2 > 0) ? 1 : 0;
		count += (num3 > 0) ? 1 : 0;

		return count;
	}

	public static int positive(int num1, int num2, int num3, int num4) {
		int count = 0;

		count += (num1 > 0) ? 1 : 0;
		count += (num2 > 0) ? 1 : 0;
		count += (num3 > 0) ? 1 : 0;
		count += (num4 > 0) ? 1 : 0;

		return count;
	}

	public static int positive(int num1, int num2, int num3, int num4, int num5) {

		int count = 0;

		count += (num1 > 0) ? 1 : 0;
		count += (num2 > 0) ? 1 : 0;
		count += (num3 > 0) ? 1 : 0;
		count += (num4 > 0) ? 1 : 0;
		count += (num5 > 0) ? 1 : 0;

		return count;
	}

}
