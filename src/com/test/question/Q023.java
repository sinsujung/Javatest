package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		//요구사항] 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		Calendar dadBD = Calendar.getInstance();
		Calendar daughterBD = Calendar.getInstance(); 
		long nowTick = now.getTimeInMillis();
		
		//아빠 생일 입력 받기
		System.out.print("아빠 생일(년): ");
		int dadYear = scan.nextInt();
		
		System.out.print("아빠 생일(월): ");
		int dadMonth =scan.nextInt();
		
		System.out.print("아빠 생일(일): ");
		int dadDate =scan.nextInt();
		
		//딸 생일 입력 받기
		System.out.print("딸 생일(년): ");
		int daughterYear = scan.nextInt();
	
		System.out.print("딸 생일(월): ");
		int daughterMonth =scan.nextInt();

		System.out.print("딸 생일(일): ");
		int daughterDate =scan.nextInt();
		
		//입력 받은 정보로 아빠 생일 지정
		dadBD.set(dadYear, dadMonth, dadDate);
		long  dadBDTick = dadBD.getTimeInMillis();
		
		//입력 받은 정보로 딸 생일 지정
		daughterBD.set(daughterYear, daughterMonth, daughterDate);
		long daughterBDTick = daughterBD.getTimeInMillis();
		
		//아빠와 딸이 살아온 일수를 구하고 아빠의 살아온 날 수에서 딸의 살아온 날 수를 빼준 뒤 출력
		int dadLife = (int) ((nowTick - dadBDTick ) /1000 / 60/ 60/ 24);
		int daughterlife = (int) ((nowTick - daughterBDTick ) /1000 / 60/ 60/ 24);
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",(dadLife - daughterlife));
		
		
	}//main
}










