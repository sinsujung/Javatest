package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		//요구사항] 아래와 같이 출력하시오.
		/*
		 	1	2	3	4	10
			5	6	7	8	26	
			9	10	11	12	42
			13	14	15	16	58
			28	32	26	40	136
		 	
		 */
		int[][]nums = new int[5][5];
		
		
		int n = 1;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nums[i][j] = n;
				nums[i][4]+=n; // 가로 덧셈 식
				nums[4][j]+=n; // 세로 덧셈 식
				nums[4][4]+=n; //4,4 덧셈 식
				
				n++;				
	
			}	
		}
		//출력
		
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						System.out.printf("%5d", nums[i][j]);
					}
					System.out.println();
				}
	}//main
}
