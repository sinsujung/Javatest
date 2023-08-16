package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		
		//요구사항] 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		
		Calendar now = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		//사용자들의 이름과 만난 날짜를 입력받고 각 변수에 저장.
		System.out.print("남자 이름: ");
		String boyName = scan.nextLine();
		
		System.out.print("여자 이름: ");
		String girlName = scan.nextLine();
		
		System.out.print("만난날(년): ");
		String meetYear = scan.nextLine();
		
		System.out.print("만난날(월):  ");
		String meetMonth = scan.nextLine();

		System.out.print("만난일(일): ");
		String meetDate = scan.nextLine();
		
		
		
		//입력 받은 정보를 통해 출력
		System.out.printf("'%s'과(와) '%s'의 기념일\n", boyName, girlName);
		
		
		
		//.add를 통해 지정한 날짜로 부터 지나간 일 수를 더해서 출력.
		now.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", now);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", now);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", now);
		
		now.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", now);
		
		now.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", now);
		
		
		
	}
}
