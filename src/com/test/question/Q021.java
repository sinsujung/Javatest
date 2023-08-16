package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		/*요구사항] 태어난 년도를 입력하면 나이를 출력하시오.
		
		조건1. 올해를 기준으로 나이 계산
		
		*/
		int age = 0;
		int year = 0;
		
		Scanner scan = new Scanner(System.in);
		
		// 사용자에게 태어난 년도에 대한 정보를 입력 받은 뒤 변수 year에 저장
		System.out.print("태어난 년도");
		
		year = scan.nextInt();
		
		//캘린더를 호출하여 현재 년도를 받아오고 사용자에게 입력 받은 태어난 년도를 빼 준 뒤 1을 더해준다.
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR) - year + 1 );
		
	}
}
