package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		
		//요구사항] 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		//조건] 1~9까지만 입력하시오.
		
		String txt = "";
		
		Scanner scan = new Scanner(System.in);

		for(int i=0; i <10 ; i ++) {
			
			System.out.print("숫자: ");
			int num = scan.nextInt();
			
			txt += getKorean(num);
		}
		System.out.println(txt);
	}

	private static String getKorean(int num) {
		
		if (num == 1) {
		return "일";
	} else if (num == 2) {
		return "이";
	} else if (num == 3) {
		return "삼";
	} else if (num == 4) {
		return "사";
	} else if (num == 5) {
		return "오";
	} else if (num == 6) {
		return "육";
	} else if (num == 7) {
		return "칠";
	} else if (num == 8) {
		return "팔";
	} else if (num == 9) {
		return "구";
	} 
		return "" ;
	}
}
