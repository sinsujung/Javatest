package com.test.question;

import java.util.Scanner;

public class Q082 {
	
	public static void main(String[] args) {
		
		//요구사항] 숫자를 입력받아 각 자릿수의 합을 구하시오.
		
		String nums = "";
		String result ="";
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		nums = scan.nextLine();//숫자 입력 받고 
		
		
		for(int i=0; i<nums.length(); i++) {
			
			sum += nums.charAt(i)-48;
			// 문자 0~9까지가 아스키 코드로 48부터시작,
			// 숫자의 합을 변수 sum에 저장 
			result += nums.charAt(i);
			//문자들을 한글자씩 변수 result 에 저장 

			
			if(i < nums.length()-1) {
				result += " + ";
				//마지막 문자 전까지 문자들을 저장할 때 +를 같이 저장 
			}
			
		}
		System.out.printf("%s =  %d", result, sum);
		
	}//main

}
