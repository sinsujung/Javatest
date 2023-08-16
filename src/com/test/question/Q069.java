package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	
	public static void main(String[] args) {
		
		/*요구사항
		배열의 요소를 순차적으로 2개씩 더한 
		결과를 배열로 생성한 뒤 출력하시오.
		
		조건..
		원본 배열 길이: 사용자 입력
		원본 배열 요소: 난수(1~9)
		결과 배열 길이: 사용자 입력 / 2
		 */
		
		Scanner scan = new Scanner(System.in);// 스캐너 호출

		System.out.print("배열 길이: ");
		int input = scan.nextInt(); // 배열길이 입력 받기

		int[] nums = new int[input];
		int[] sums = new int[input / 2];
		// int[] sums = new int[input/2]; //배열 선언 sums은 결과값 넣을것

		for (int i = 0; i < nums.length; i++) {
			int rnd = (int) (Math.random() * 9) + 1;
			nums[i] = rnd;// 난수생성해서 numsㅂㅐ열에 넣기
		}
		System.out.print("원본: ");
		System.out.println(Arrays.toString(nums));
	
		for (int i = 0; i < nums.length - 1; i += 2) {
			sums[i/2] = nums[i] + nums[i + 1];
			// 배열 0번더하기 1번, 2번 더하기 3번 ...
				
			if (nums.length % 2 ==1 ){
				sums[sums.length-1] = nums[nums.length-1];
			}
			// i는 nums 배열 길이보다 1 적게까지 돌리고 nums[i] + nums[i+1]해준다~

		}	
		System.out.print("결과: ");
		//System.out.println(Arrays.toString(sums));

		printArray(sums);

		}// main

	private static void printArray(int[] nums) {
		
		String temp = "[";
		for(int i=0; i<nums.length; i++) {
			temp+=nums[i];
			if(i<nums.length -1) {
				temp+=",";
			}
		}
		temp+="]";
		System.out.println(temp);
				
	}
	}
// 1. nums[i] + nums[i+1]를 짝수 홀수 나눠서 출력하는 방법
//2. int[] shortNums = new int[(length % 2 == 0) ? length / 2 : length / 2 + 1];
//3. 마지막 난수는 혼자 나와야함
//TODO


