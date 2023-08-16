package com.test.question;

import java.util.Scanner;

public class Q045 {

	public static void main(String[] args) {
		// 요구사항] 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		/*
		 * 조건] 최대 3자리까지만 입력하시오.
		 */
		int num = 0 ;
		int sum = 0;
		String txt ="";
		Scanner scan = new Scanner(System.in);

		System.out.print("최대 숫자: ");
		num = scan.nextInt();
		
		if ( num < 1000) {
			
			for(int i=1; i<=num; i++) {
				System.out.print(checkClap(i) + " ");
			}
			System.out.println();
			
		}else {
			System.out.println("1000 이하만 가능합니다.");
		}
	}// main

	private static String checkClap(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}//TODO
