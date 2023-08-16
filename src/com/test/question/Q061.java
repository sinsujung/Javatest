package com.test.question;

import java.util.Scanner;

public class Q061 {
	
	public static void main(String[] args) {
		//요구사항] 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		//조건] int[] nums = new int[5];
		/*
		 	출력]
		 	 nums[4] = 3
			 nums[3] = 2
			 nums[2] = 7
			 nums[1] = 1
			 nums[0] = 5
			 
		 */
		
		
		int[] nums = new int [5];
		
		Scanner scan = new Scanner(System.in);

		for(int i=0; i < nums.length; i++) {
			
			System.out.print("숫자: ");
			int input = scan.nextInt();
			
			nums[i] = input;
			//nums[0] > 5
			//nums[1] > 1
			//nums[2] > 7
			//nums[3] > 1
			//nums[4] > 3
			
		}
		//역순으로 뽑아야해서 
		for(int i = nums.length-1; i>=0; i --) {
		
		System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
	}

}
