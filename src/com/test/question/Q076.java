package com.test.question;

import java.util.Scanner;

public class Q076 {
	
	public static void main(String[] args) {
		
		//요구사항] 성적을 입력받아 아래와 같이 출력하시오.
		/*
		 	조건] String[][] score = new String[10][3];
		 		국어 점수: 80 

				영어 점수: 50 

				수학 점수: 70
		 */
		
		String [][]score = new String[10][3]; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();

		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수: "); //점수 입력 받기
		int math = scan.nextInt();
		
		for(int i=0; i<score.length; i++ ) { //점수가 80점이라고 할때 10점마다 ◼ 를 쌓는다 점수가 80점을 넘어가면 공백 출력
			
			if(kor >= (i+1)*10) {
				score[i][0] = "◼";
			}else {
				score[i][0]= "";
			}
			if(eng >=(i+1)*10) {
				score[i][1] = "◼";
			}else {
				score[i][1]= "";
			}
			if(math >= (i+1)*10) {
				score[i][2] ="◼︎";
			}else {
				score[i][2]= "";
			}
		}
		
		for(int i=score.length-1; i>=0; i--) {
			for(int j=0; j<score[0].length; j++) {
				System.out.print(" "+ score[i][j]+ "\t");
			}
			System.out.println();// 배열의 저장한 값을 출력한다 (9.0)자리부터 출력
			
		}
		
		System.out.println("___________________");
		System.out.println(" 국어\t영어\t수학");
	}//main

}
