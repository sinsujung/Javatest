package com.test.question;

public class Q057 {
	
	public static void main(String[] args) {
		
		//요구사항] 아래와 같이 출력하시오.
		/*
		 1 ~  10:   55
		 1 ~  20:  210
		 1 ~  30:  465
		 1 ~  40:  820
		 1 ~  50: 1275
		 1 ~  60: 1830
		 1 ~  70: 2485
		 1 ~  80: 3240
		 1 ~  90: 4095
		 1 ~ 100: 5050
		 */
		// 1부터 100까지 숫자들로
		 
		m1();
		
		m2();
		
			
	}//main

	private static void m2() {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			
			if (i % 10 == 0) {
				System.out.printf("1~%3d: %4d\n", i , sum);
			}
		}
	}
//
	private static void m1() {
		int sum = 0;
		
		for(int i=10; i<=100; i+=10 ) {
			
			for(int j = 1; j<i; j++) {

				sum += j;	
			}
			System.out.printf("1 ~%3d: %4d\n", i , sum);
		}
	}

	
}
