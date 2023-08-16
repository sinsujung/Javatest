package com.test.question;

import java.util.Scanner;


public class Q015 {
	
	public static void main(String[] args) {
		
		System.out.println("맑은날 : ");
		Scanner scan1 = new Scanner(System.in);
		int sunny = scan1.nextInt();
		
		System.out.println("흐린날 : ");
		Scanner scan2 = new Scanner(System.in);
		int foggy = scan1.nextInt();
		
		System.out.println("사과가 총 " + getApple(sunny, foggy) + "개 열렸습니다.");	
	}//main
	public static int getApple(int sunny, int foggy) {
		int length = 0;
		length = (sunny * 5 + foggy * 2 - 100) / 10;
//		int apple = 0;
		//length = length - 100;
//		apple = length / 10 ;
//		return apple;
		return length ;
	}
}
