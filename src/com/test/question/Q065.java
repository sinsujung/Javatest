package com.test.question;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {
		//요구사항] 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		/*
		 	조건] 
		 	 난수를 20개 발생 후 배열에 넣는다.
		 	 난수는 1~20사이
		 	 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		
		System.out.print("최대 범위: ");
		int max = scan.nextInt();

		System.out.print("최소 범위: ");
		int min = scan.nextInt(); // 최대 최솟값 받기

		int[] randomArray = new int[20]; //20크기의 배열 생성
		
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = random.nextInt(20) + 1; //무작위 정수를 배열 안에 넣는다
		}//random.nextInt(20)은 0 이상 19 이하의 무작위 정수를 생성하고, 
		//여기에 1을 더하여 1부터 20까지의 무작위 정수를 얻는다.
		
		System.out.print("원본: ");
		
		
		for (int i = 0; i < randomArray.length; i++) {
			if (i == randomArray.length - 1) {
				System.out.println(randomArray[i]);
			} else {
				System.out.print(randomArray[i] + ", ");
			} //배열의 요소 뒤에 쉼표를 더해서 출력하고 마지막 배열 요소는 그냥 출력
		}
		System.out.println();
		System.out.print("결과: ");

		for (int i = 0; i < randomArray.length; i++) {
			if(randomArray[i] <= max && randomArray[i] >= min) {
				System.out.print(randomArray[i] + ", ");	
			} //최대범위와 최소범위 사이의 숫자 출력인데 마지막 쉼표 어떻게 없애면 좋을까
		

		}
		/*private static void printValDot(int length, int val, int i) {
		System.out.print(val);
		if (i != length - 1) {	//마지막이 아닌 경우만 , 붙인다.
			System.out.print(", ");
			}
		}
			*/
		
	
	}// main
}
