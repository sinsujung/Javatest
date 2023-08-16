package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		
		System.out.println("℃ 를 입력하세요: ");
		
		Scanner input = new Scanner(System.in);
		
		double temperature = input.nextInt();
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.", temperature, (temperature * 1.8) + 32 );
	}

}
