package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int score = scan.nextInt();
		if (score > 90) {
			System.out.printf("입력한 %d점은 성적 A 입니다.\n", score);
		} else if (score > 80) {
			System.out.printf("입력한 %d점은 성적 B 입니다.\n", score);
		} else if (score > 70) {
			System.out.printf("입력한 %d점은 성적 C 입니다.\n", score);
		} else if(score > 60) {
			System.out.printf("입력한 %d점은 성적 D 입니다.\n", score);
		} else if(score > 50) {
			System.out.printf("입력한 %d점은 성적 F 입니다.\n", score);
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
	}

}
