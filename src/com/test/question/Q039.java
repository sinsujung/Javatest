package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {
		
		//요구사항] 아래와 같이 출력하시오.
		int sum = 0 ;
		String txt ="" ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		int last = scan.nextInt();
		
		for(int i=start; i<=last; i++) {
			sum += i;//3
			txt += i;//1 + 2 + 3
			
			if(i < last) {
				txt += " + ";
				
			}
			
		}
		System.out.println(txt + "=" + sum);

	}
}//TODO !

