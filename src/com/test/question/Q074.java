package com.test.question;

public class Q074 {

	public static void main(String[] args) {
		
		//요구사항] 아래와 같이 출력하시오.
		/*
		 	0	0	1	0	0
			0	2	3	4	0
			5	6	7	8	9
			0	10	11	12	0
			0	0	13	0	0
		 */
int[][]nums = new int[5][5];
		
		//데이터 입력 > 문제
		int n = 1;
		
			for (int i = 0; i<nums.length/2+1; i++) {
				for (int j = 2-i; j <=2+i; j++) {
					nums[i][j] = n;
					n++;
				}
			}
			for(int i=nums.length/2+1; i<nums.length; i++) {
				for(int j =i-2; j<=6-i; j++) {
					nums[i][j] = n;
					n++;
				
				}
		}
	
		//출력 > 수정없이 그대로 사용
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
				
	}//main
}//어려워용 모르겠어용
