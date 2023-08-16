package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {
		// 요구사항] 배열에 요소를 삽입하시오.
		/*
		 * 조건] 배열 길이:10 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		 */
		//배열에 요소를 삽입하시오.
		
				//배열 삽입 > Right Shift 구현(발생)
			
				Scanner scan = new Scanner(System.in);
				
				int[] nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
				
				System.out.print("삽입 위치: ");
				int index = scan.nextInt();
				
				System.out.print("값: ");
				int value = scan.nextInt();
				
				System.out.print("원본: ");
				System.out.println(Arrays.toString(nums));
				
				//Right Shift
				for(int i = nums.length-2; i>=index; i--) {
					//오른쪽방 = 왼쪽방
					nums[i+1] = nums[i];
				}

				nums[index] = value;
				System.out.print("결과: ");
				System.out.println(Arrays.toString(nums));
				
				
				
			}//main
	}// if (index == nums.length - 1) { // 배열의 마지막 자리일 경우 바로 넣고 종료.
//nums[index++] = value;
//break;
//}