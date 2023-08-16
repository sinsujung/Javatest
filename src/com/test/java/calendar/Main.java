package com.test.java.calendar;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		
		//일정 불러오기
		//- item.txt > Data.list
		Data.load();
		
		/*Main > 달력 출력
		Item > 일정(상자)
		Data > 일정 처리(읽기)
		*/
		
		
		//달력 출력 + 일정 출력
		
		//달력
		//1. 년월 > 1일 > 요일?
		//2. 년월 > 마지막 날짜?
		
		int year = 2023;
		int month = 8;

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);// 2023-08-01

		int lastDate = c.getActualMaximum(Calendar.DATE);// 마지막 날짜
		int firstDay = c.get(Calendar.DAY_OF_WEEK); // 1일의 요일(3)

		// System.out.println(lastDate);
		// System.out.println(firstDay);

//		for (month = 1; month <= 12; month++) {
			System.out.println("\t\t\t" + month + "월");
			System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");

			// System.out.print("\t\t");
			for (int i = 0; i < firstDay - 1; i++) {
				System.out.print("\t");

			}
			for (int i = 1; i <= lastDate; i++) {
				System.out.printf("%3d\t", i);

				if ((i + firstDay) % 7 == 1) {
					System.out.println();
				}
//			}
//			System.out.println();
//			System.out.println();
				
				//일정 출력
				//- 위에 출력된 날짜와 동일한 날짜의 일정이 있는지 확인 > 루프
//				for(int j=0; j<Data.list.size(); j++) {
//					if(Data.list.get(j).getDate()
//							.equals(String.format("%d-%02d-%02d", year, month, i))) 
				{
//							System.out.print(Data.list.get(j).getTitle());
//					}
//				}
					
					//현재 출력되는 날짜의 한주
					for(int j=i+1-7; j<i+8-7 && j<=lastDate; j++) {
						System.out.printf("%s\t"
								, getItem(String.format("%d-%02d-%02d", year, month, j)));
					}
						System.out.println();	
						System.out.println();	
				}
			}
	}//main

	private static Object getItem(String date) {
		for(Item item : Data.list) {
			if(item.getDate().equals(date)) {
				return item.getTitle()	;
			}
		}
		return "";
	}
	

}
