package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		
		System.out.println("사각형의 너비를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		int first = scan.nextInt();
		
		System.out.println("사각형의 높이를 입력하세요 : ");
		
		Scanner height = new Scanner(System.in);
		
		int second = height.nextInt();
		
		System.out.printf("사각형의 넓이는 %d ㎠입니다.\n" , first * second);
		System.out.printf("사각형의 둘레는 %d  ㎝입니다." , 2*(first + second));
		
	}
}
