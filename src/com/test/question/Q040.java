package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {

		// 요구사항] 아래와 같이 출력하시오.
		int start = 0;
		int last = 0;
		int sum = 0;
		String txt = "";
		String op = " - ";

		Scanner scan = new Scanner(System.in);

		System.out.print("시작 숫자: ");
		start = scan.nextInt();

		System.out.print("종료 숫자: ");
		last = scan.nextInt();

		for (int i = start; i <= last; i++) {

			if (op.equals(" - ")) {
				sum += i;// 1 - 2 + 3 - 4
				txt += i;// 1 - 2 + 3 - 4 +

				if (i < last) {
					txt += op;
				}
				
				op = " + ";
				
			} else {
				sum -= i;
				txt += i;
				
				if (i < last) {
					txt += op;
				}
				
				op = " - ";

			}

		}

		System.out.println(txt + " = " + sum);

		scan.close();

	}// main
}// TODO!!
