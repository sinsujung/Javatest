package com.test.question;

import java.util.Scanner;

public class Q087 {
	
	public static void main(String[] args) {
		
		//요구사항] 영단어를 입력받아 분리하시오.
		/* 
		 	조건] 
		 	합성어를 입력한다.
			합성어는 파스칼 표기법으로 입력한다.
			출력은 각 단어를 공백으로 구분한다.
		 */
		
		String word ="";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어: ");
		word=scan.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			
			char temp = word.charAt(i); //입력받은 단어를 문자로 반환 
			
			if(temp >= 'A' && temp <= 'Z' && i !=0) {
				System.out.print(" ");// 만약 문자가 A~Z이고 첫번째 문자가 아니면 공백을 추가 
			}
			System.out.print(temp); // 단어길이만큼 돌고 출력 
		}
	}//main

}
