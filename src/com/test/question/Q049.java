package com.test.question;

import java.util.Scanner;

public class Q049 {

	public static void main(String[] args) {

		// 요구사항 ] 아래와 같이 출력하시오.
		// 조건] 행의 갯수를 입력받으시오.

		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int num = scan.nextInt();
		
		//i = 5, j = 0, j < 4

		for (int i = num; i > 0; i--) {
			
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}