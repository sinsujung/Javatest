package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	
	public static void main(String[] args) {
		/*요구사항
		배열의 요소를 삭제하시오.

		조건..
		배열 길이: 10
		마지막 요소는 0으로 채우시오.
		*/

		//배열의 요소를 삭제하시오.
		
		//배열 요소 삭제 > Left Shift 발생
		Scanner scan = new Scanner(System.in);
		
		int[]nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		System.out.print("삭제 위치: ");
		int index = scan.nextInt();
		
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=index; i<nums.length-1; i++) {
				
			//왼쪽방 = 오른쪽방
			nums[i] = nums[i+1];
		}
		
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
	}//main

}
		
