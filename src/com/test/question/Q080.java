package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		//요구사항] 문장을 입력받아 역순으로 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		String sentence = scan.nextLine();
		
		System.out.print("역순 결과: \"");
		for(int i = sentence.length()-1; i>=0; i--) { //뒤에서부터 한글자씩 출력
			System.out.print(sentence.substring(i, i+1));
		}
		System.out.print("\"");
		
	}//main
}
