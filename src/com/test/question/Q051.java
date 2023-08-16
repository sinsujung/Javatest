package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {

		// 요구사항] 아래와 같이 출력하시오.
		// 조건] 행의 갯수를 입력받으시오.

//		    *
//		   ***
//	      *****
//		 *******
//		*********

		Scanner scan = new Scanner(System.in);

		System.out.print("행: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {

			for (int j = 0; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
