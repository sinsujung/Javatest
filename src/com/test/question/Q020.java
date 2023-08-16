package com.test.question;

import java.util.Calendar;
import java.util.Date;

public class Q020 {

	public static void main(String[] args) {
		
		//요구사항 ] 오늘 태어난 아이의 백일과 첫돌을 출력하시오. 
		
		birthday();
		
	}
	
	public static void birthday() {
		//백일 : 2023-10 -29
		Calendar onehundredth = Calendar.getInstance();
		
		onehundredth.set(2023, 6, 21);
		onehundredth.add(Calendar.DATE, 100);
		
		System.out.printf("백일 :%tF\n", onehundredth );
		
		//첫돌: 2024-07-21
		
		Calendar firstBirth = Calendar.getInstance();
		
		firstBirth.set(2023, 6, 21);
		firstBirth.add(Calendar.YEAR, 1);
		
		System.out.printf("첫돌 :%tF\n", firstBirth);
		
	}
}
