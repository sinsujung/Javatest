package com.test.question;

import java.util.Scanner;

public class Q088 {
	
	public static void main(String[] args) {
		//요구사항] 금지어를 마스킹 처리 하시오.
		//조건] 금지어 : 바보, 멍청이
		String[] words = {"바보", "멍청이"};
		int count = 0;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String content = scan.nextLine();
		
		
		
		for (int i=0; i<words.length; i++) {
			if(content.indexOf(words[i]) > -1) {
				count++;
			}
		}
		
		for (int i =0; i<words.length; i++) {
			content = content.replace(words[i],getMaskedText(words[i]));
		}
		System.out.println(content);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n", count);
	}//main

	private static String getMaskedText(String words) {
		
		String temp= "";
		
		for(int i=0; i< words.length(); i++) {
			temp += "*";
		}
		
		return temp;
	}
}//TODO
