package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {

		// 요구사항] 숫자를 N개 입력받아 아래와 같이 출력하시오.
		/*
		 * 조건 누적값이 100을 넘어가는 순간 루프를 종료하시오. 짝수는 더하고 홀수는 빼시오.
		 */
		int sum = 0;
		String txt = "";
		String plus = " + ";
		String minus = " - ";
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 100;) {
			System.out.print("숫자: ");
			int num = scan.nextInt();

			if (num % 2 == 0) {
				sum += num;
				txt += plus + num;
			} else {
				sum -= num;
				txt += minus + num;
							
			}
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(txt + " = " + sum);
	}// main
}
