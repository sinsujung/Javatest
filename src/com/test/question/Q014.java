package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
		int total;
		
		System.out.println("지나가는 역의 개수: ");
		Scanner scan1 = new Scanner(System.in);
		int station = scan1.nextInt();

		System.out.println("환승역의 횟수: ");
		Scanner scan2 = new Scanner(System.in);
		int change = scan2.nextInt();
		
		System.out.println("시간대( 1.평상시, 2.출근시, 3.퇴근시) ");
		Scanner scan3 = new Scanner(System.in);
		int time = scan3.nextInt();
		
		total = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d 분 입니다.",total);
		
	}//main
	
	public static int getTime(int station, int change, int time) {
		int total;
		total = station * 2 + change*(time == 1 ? 3 : time == 2 ? 4 : 5);
		return total;
		
	}
}
