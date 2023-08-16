package com.test.question;

import java.util.Scanner;

public class Q089 {
	
	public static void main(String[] args) {

		//요구사항] 입력받은 금액을 한글로 출력하시오.
		//조건] 입력 범위(원): 0~ 99.999.999
		String result = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		String money = scan.nextLine();//금액을 입력받는다.
		
		for(int i=0; i<money.length(); i++) {
			
			char c = money.charAt(i); // 입력받은 금액을 문자로 바꿔준다.
			
			 result += getNum(c); // 입력 받은 숫자 마다 한글로 바꿔서 result 변수에 저장 
			 result += getUnit(i, money.length(), getNum(c));
		}
		System.out.println("일금 " + result);
	}//main

		private static String getNum(char c) {
			if(c == '1') {
				return "일";
			}else if(c == '2') {
				return "이";
			}else if(c == '3') {
				return "삼";
			}else if(c == '4') {
				return "사";
			}else if(c == '5') {
				return "오";
			}else if(c == '6') {
				return "육";
			}else if(c == '7') {
				return "칠";
			}else if(c == '8') {
				return "팔";
			}else if(c == '9') {
				return "구";
			}
			
			return "";
		}
		private static String getUnit(int i, int length, String num) { // 숫자 5개를 기준으로 일,십,백,천,
																	//만,십(만),백(만),천(만)으로 반복되서 ""이 아닌 문자는 4로 나눈 나머지 번째째의
																	//문자가 temp에 입력된다. 
			
			String[]unit = {"원", "만"};
			String[]unit2 = {"천","","십","백"};
			String temp = "";
			
			if(!num.equals("")) {
				temp += unit2[(length-i) % 4];
			}
			
			if((length-i) % 4 ==1) {
				temp += unit[(length - i)/ 5];
			}
			
			return temp;
		}//메소드 getUnit은 선생님꺼 보고 이해
		

}
