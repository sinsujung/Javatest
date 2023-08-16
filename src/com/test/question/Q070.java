package com.test.question;

public class Q070 {

	public static void main(String[] args) {
		
		//아래의 요구사항을 구현하시오.
		/*
		 1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		 */

		// 데이터 입력 > 문제	
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 5; j++) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//		for (int i = 1; i < 2; i++) {
//			for (int j = 4; j >= 0; j--) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//		for (int i = 2; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//		for (int i = 3; i < 4; i++) {
//			for (int j = 4; j >= 0; j--) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//		for (int i = 4; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
		int[][] nums = new int[5][5];
		int n = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					nums[i][j] = n;
					n++;
				}//짝수열일때는 순차적으로 증가하고
			} else {
				for (int j = 4; j >= 0; j--) {
					nums[i][j] = n;
					n++;
				}//홀수열 일때는 역순으로 증가한다
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}

	}
}
