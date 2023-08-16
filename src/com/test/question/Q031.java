package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		//요구사항] 숫자 5개를 입력받아 짝수와 홀수의 개수 출력하시오.
		int even = 0 ;
		int odd = 0 ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력: ");
		int num = scan.nextInt();
		if(num % 2 ==0) {
			even++;
		} else {
			odd ++;
		}
		
		System.out.println("숫자 입력: ");
		 num = scan.nextInt();
			if(num % 2 ==0) {
				even++;
			} else {
				odd ++;
			}
		 
		System.out.println("숫자 입력: ");
		 num = scan.nextInt();
		 if(num % 2 ==0) {
				even++;
			} else {
				odd ++;
			}
		 System.out.println("숫자 입력: ");
		 num = scan.nextInt();
		 if(num % 2 ==0) {
				even++;
			} else {
				odd ++;
			}
		 
		 System.out.println("숫자 입력: ");
		 num = scan.nextInt();
		 if(num % 2 ==0) {
				even++;
			} else {
				odd ++;
			}
		 
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", even-odd);
		
		//짝수가 많을 경우를 대비 하여 마지막 구문 if문으로 구현
		
				
	}//main

}
