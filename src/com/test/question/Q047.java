package com.test.question;

import java.util.Scanner;

public class Q047 {

	public static void main(String[] args) {
	
		//요구사항] 자판기 프로그램을 구현하시오.
		int coke = 700;
		int sprite = 600 ;
		int vita = 500;
		
		Scanner scan = new Scanner(System.in);
		
		for (;;) {
			System.out.println("====================");
			System.out.println("	자판기");
			System.out.println("====================");
			System.out.println("1.콜라 : 700원");
			System.out.println("2.사이다 : 600원");
			System.out.println("3.비타500 : 500원");
			System.out.println("----------------------");
			System.out.println("금액 투입(원): ");
			int money = scan.nextInt();
			
			if (money > 0) {
				System.out.printf("금액 투입(원) : %d\n", money);
				System.out.println("----------------------");
				System.out.println("음료 선택(번호) : ");;
				int beverage = scan.nextInt();
				System.out.println("----------------------");
				if(beverage == 1 ) {
					System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", money - coke);
				} else if (beverage == 2) {
					System.out.println("+사이다를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", money - sprite);
				}else {
					System.out.println("+비타500을 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", money - vita);
				}
				System.out.println();
				System.out.println("계속하시려면 엔터를 입력하세요.");
			}
		}
		
		
		
	}

}
