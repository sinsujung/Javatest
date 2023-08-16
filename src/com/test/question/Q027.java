package com.test.question;

import java.util.Scanner;

public class Q027 {
	public static void main(String[] args) {
		//요구사항] 문자 1개를 입력받아 아래와 같이 출력하시오.
		/* 조건 ]
		 		f,F -> Father
				m,M -> Mother
				s,S -> Sister
				b,B -> Brother
				유효성 검사를 하시오. (위의 문자가 아닌 문자는 예외 처리)
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자: ");

		String letter = scan.nextLine();
		String word = "";
		if (letter.equals("f") || letter.equals("F")) {
			word = "Father";
		} else if (letter.equals("s") || letter.equals("S")) {
			word ="Sister";
		} else if (letter.equals("m") || letter.equals("M")) {
			word ="Mother";
		} else if (letter.equals("b") || letter.equals("B")) {
			word ="Brother";
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		System.out.printf("%s", word);
	}

}
