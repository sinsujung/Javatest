package com.test.question;

import java.util.Calendar;

import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		//요구사항] 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		
		/*
		 
		 조건]
		 	입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		 	입력받은 날짜가 토/일요일이면 아무것도 안한다.
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년");
		int year = scan.nextInt();
		
		System.out.print("월");
		int month = scan.nextInt();
		
		System.out.print("일");
		int date = scan.nextInt();
		
		//캘린더에는 달을 0~11까지로 표현하기 때문에 -1을 해준다.
		Calendar now = Calendar.getInstance();
		now.set(year, month-1, date);
		
		//입력한 값이 일요일(1)과 토요일(7)이 아니면 준비된 문장을 출력하도록 한다.
		if(now.get(Calendar.DAY_OF_WEEK) != 1 && now.get(Calendar.DAY_OF_WEEK) != 7) {
			
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			
			
			//일요일(7)에서 현재 날짜를 빼서 나온 일 수를 추가하여 다음주 주말로 변경
			now.add(Calendar.DATE, 7 - now.get(Calendar.DAY_OF_WEEK));
			
			System.out.printf("이동한 날짜는 '%tF' 입니다.\n", now);
			
			//이미 휴일인 날짜일 경우 다음과 같이 출력
			
		} else {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		}
		
		
		
		
	}//main
}














