package com.test.question;

import java.util.Scanner;

public class Q090 {
	
	public static void main(String[] args) {
		
		//요구사항] 입력받은 문장에서 숫자를 찾아 그 합을 구하시오.
		//조건] 모든 숫자는 한자리 숫자로 처리한다.
		
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String txt = scan.nextLine();//문장 입력 
		

		for(int i=0; i<txt.length(); i++) {// 문장 길이만큼 for문을 돌면서 문자열을 문자로 바꿔준다 
			
			char c = txt.charAt(i);
			
			if(c >= '0' && c<= '9') { // 반환해준 문자들 중 0부터 9까지의 문자들의 값을 구한다(문자 0부터 9까지의 값 : 48~57) 
				sum += c - 48;
				
			}
			
		}
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n", sum);
		
	}//main

}
