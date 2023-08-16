package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {

		// 아래와 같이 출력하시오.
		// 조건 ] 행의 갯수를 입력받으시오.
// 		    *
//		   **
//		  ***
//		 ****
//		*****

		Scanner scan = new Scanner(System.in);

		System.out.print("행: ");
		int line = scan.nextInt();

		for (int i = line; i < line; i--) {
			System.out.print(" ");

			for (int j = 0; j < line + 1; j++) {

			}
			for (int j = 0; j > i; j++) {
				System.out.print("*");
			}
		}
	}// main

}//TODO
