package com.test.question;

import java.lang.reflect.Array;
import java.util.Random;

public class Q064 {

	public static void main(String[] args) {
		
		//요구사항] 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		//조건] 
		// 난수를 20개 발생 후 배열에 넣는다.
		// 난수는 1~20 사이
		/*
		 	출력]
		 	원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
			최댓값: 18
			최솟값: 3
		 */
		int []randomArray = new int[20]; // 크기가 20배열 선언
		
		Random random = new Random();
		
		for(int i =0; i <randomArray.length; i++) {
			randomArray[i] = random.nextInt(20)+1; //무작위 정수를 배열 안에 넣는다.
		}
		//random.nextInt(20)은 0 이상 19 이하의 무작위 정수를 생성하고, 
		//여기에 1을 더하여 1부터 20까지의 무작위 정수를 얻는다.

		int max = 1;
		int min = 20;
		/*
		 max = (max < nums[i]) ? nums[i] : max;
         min = (min > nums[i]) ? nums[i] : min;
		 */
		for(int i =0; i< randomArray.length; i++) {
			if(randomArray[i] > max) {
				max = randomArray[i];
			}
			
			if(randomArray[i] < min) {
				min = randomArray[i];	
			} //for문을 돌면서 배열 안에 있는 값을 max와 비교하여 max보다 큰 숫자가 있으면 max를 그 숫자로 초기화
			
		}
		System.out.print("원본 :");
		
		for(int i=0; i<randomArray.length; i++) {
			
			System.out.print(randomArray[i]+",");
		}
		System.out.println();
		System.out.printf("최댓값: %d\n", max);
		System.out.printf("최솟값: %d", min);// 출력
		
	}
}
