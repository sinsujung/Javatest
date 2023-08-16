package com.test.question;

import java.util.Calendar;

public class Q019 {

	public static void main(String[] args) {
		
		//요구사항] 현재 시간을 출력하는 메소드를 선언하시오.
		nowTime();
	}
	
	public static void nowTime() {
		//캘린더 클래스 인스턴스를 생성한다.
		Calendar now = Calendar.getInstance();
		
		//현재 시간 : 10시 30분 25초
		System.out.printf("지금은 %d시 %02d분 %02d초 입니다.\n"	
					, now.get(Calendar.HOUR_OF_DAY)
					, now.get(Calendar.MINUTE)
					, now.get(Calendar.SECOND));
		
		//현재 시간 : 오전 10시 30분 25초
		System.out.printf("지금은 %s %d시 %02d분 %02d초 입니다.\n"
				, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"	
				, now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE)
				, now.get(Calendar.SECOND));
	}
}// 다른 분들이랑 코드가 비슷하다.
