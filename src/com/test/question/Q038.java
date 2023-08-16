package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		
		//요구사항] 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		int evensum = 0;
		int oddsum = 0;
		int num = 0 ;
		int input = 0;
		
		System.out.print("입력 횟수: ");
		input = scan.nextInt();
		
		for(int i=1; i<=input; i++ ) {

			System.out.print("숫자: ");
			num = scan.nextInt();
			
		if(num % 2 == 0) {
			even++;
			evensum += num;
		}else {
			odd++;
			oddsum += num;
		}
			
		}
		System.out.printf("짝수 %d개의 합: %d\n", even, evensum);
		System.out.printf("홀수 %d개의 합: %d", odd, oddsum);
	}//main
}
