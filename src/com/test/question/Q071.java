package com.test.question;

public class Q071 {

	public static void main(String[] args) {
		
		//요구사항] 아래와 같이 출력하시오.
		/*
		 	25	24	23	22	21
			20	19	18	17	16
			15	14	13	12	11
			10	9	8	7	6
			5	4	3	2	1

		 */
		int[][]nums = new int[5][5];
		
		int n = 1;
		for(int i=4; i>=0; i--) {//i가 4부터 감소함으로 맨 아래에서 시작
			for(int j=4; j>=0; j--) {//j도 4부터 감소함으로 맨 아래오른쪽에서부터 점점 증가
				nums[i][j] = n;
				n++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	
		
	}//main
	
}
