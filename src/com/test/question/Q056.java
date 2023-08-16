package com.test.question;

import java.util.Scanner;

public class Q056 {
	

	public static void main(String[] args) {
		//요구사항] 숫자를 2개 입력 받아 각각의 약수와 두 숫자의 공약수를 구하시오.
		//조건] 공약수 : 둘 이상의 정수에 공통된 약수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int first = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int second = scan.nextInt();
		
		String fristTxt = "";
	
		for(int i=1; i<=first; i++) {
				if (first % i == 0) {
					fristTxt += i+ ",";
				}
				
			}
		String secondTxt = "";
		for(int i =1; i <=second; i++) {
			if (second % i  == 0) {
				secondTxt += i + ",";
			}
		}
		String translator = "";
		for(int i=1; i<=((first<second)? first : second); i++) {
			
			if(first % i == 0 && second % i == 0) {
				translator += i + ",";
			}
		}
		
		System.out.printf("%d의 약수: "+ fristTxt+"\n",first);
		System.out.printf("%d의 약수: "+ secondTxt+"\n",second);
		System.out.printf("%d와 %d의 공약수: " + translator, first, second);
	}
}
