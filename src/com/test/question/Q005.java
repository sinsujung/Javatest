package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
	
			System.out.println("페달을 밟은 횟수를 입력하세요 : ");
			
			Scanner scan = new Scanner(System.in);
			
			int input = scan.nextInt();
			
			double m = 26 * 0.0254 * 3.14 * input;

			System.out.printf("사용자가 총 %d회 페달을 밟아 자전거가 총 %,.3f m를 달렸습니다.", input, m );
			
			
	}

}


//0.6604 * 3.14 * 1000