package com.test.question;

import java.util.Scanner;

public class Q085 {
	
	public static void main(String[] args) {
		//요구사항] 주민 등록 번호 유효성 검사를 하시오.
		//조건] '-'의 입력 유무 상관 없이 검사하시오.
		int sum = 0;
		String jumin = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호: ");
		jumin = scan.nextLine();
		
		jumin = jumin.replace("-", "");
		//'-'를 없애서 유무에 상관 없이 검사할 수 있도록 함.
		
		for (int i=0; i<12; i++) {
			sum += Integer.parseInt(jumin.substring(i, i + 1))*(i % 8 + 2);
		}
		
		sum %= 11;
		
		sum = 11- (sum % 10);
		
		if(sum == Integer.parseInt(jumin.substring(jumin.length()-1,jumin.length()))) {
			System.out.println("올바른 주민등록번호입니다 .");
			} else{
				System.out.println("올바르지 않은 주민등록번호입니다. ");
		}
		
		
	}//main

}//TODO
