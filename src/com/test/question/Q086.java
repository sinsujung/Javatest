package com.test.question;

import java.util.Scanner;

public class Q086 {
	
	public static void main(String[] args) {
		//1234567
		//요구사항] 숫자를 입력받아 3자리마다 , 를 붙이시오.
		//조건] %,d 사용 금지
		String nums = "";
		String temp = "";
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		nums = scan.nextLine();
		
		
		while(nums.length() >= 3) {
			temp = "," + nums.substring(nums.length()-3, nums.length())+temp;
			nums = nums.substring(0, nums.length()-3);
		}//숫자 길이가 3 이상인 1234567이 입력 되었을 경우 while문을 돈다
		// 뒤에서 부터 세번째 전 문자 앞에 ","를 붙이고 뒤에 temp를 붙인다.
		// 그러고 나서 입력 받은 숫자 nums가 0부터 4번째 문자로 바뀐다
		// 아직 문자가 3자리 수 이상이니 while 문을 한바퀴 더 돈다.
		
		System.out.println("결과: "+nums + temp); // 마지막 남은 nums인 1과 temp를 이어 출력 
	}//main

}
