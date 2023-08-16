package com.test.question;

import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		//요구사항] 주차 요금을 계산하시오.
		/*
		 
		  조건] 무료 주차: 30분
		  초과 10분당 : 2,000원
		  
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		// 사용자로 부터 들어온 시와 분, 나간 시와 분을 입력 받는다.
		System.out.println("[들어온 시간]");

		System.out.print("시: ");
		int inTime = scan.nextInt();
		
		System.out.print("분: ");
		int inMinute = scan.nextInt();
		
		System.out.println();
		
		System.out.println("[나간 시간]");
		
		System.out.print("시: ");
		int outTime = scan.nextInt();
		
		System.out.print("분: ");
		int outMinute = scan.nextInt();
		
		// 들어온 시간을 분 단위로 맞춰준다.
		int in = inTime * 60 + inMinute;
		int out = outTime * 60 + outMinute;
		
		//나온 시간에서 들어간 시간을 빼주고 무료 주차 시간인 30분을 뺀 뒤
		//10분 단위로 나우어 주차요금인 2000원을 곱해준다.
		int fee = (((out-in) - 30) / 10) * 2000;
		
		//주차 시간이 30분 이상일 때, 주차요금과 30분 이하일 때의 출력을 작성한다.
		if (out - in > 30) {
			System.out.printf("주차요금은 %d원 입니다.", fee);
		} else {
			System.out.println("주차요금은 0원 입니다.");
		}
		
		
		
	}//main
}
