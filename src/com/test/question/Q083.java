package com.test.question;

import java.util.Scanner;

public class Q083 {
	
	public static void main(String[] args) {
		
		//요구사항] 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오,.
		/*
		 	조건] 
		 	확장자는 다음으로 제한.
		 	mp3
			jpg
			java
			hwp
			doc
		 */
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		String file= "";//변수 선언 
	
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("파일명: "); 
			file =scan.nextLine();//입력 값 file변수에 저장 
			

			if(file.endsWith(".mp3")) {
				mp3++;
			} else if(file.endsWith(".jpg")) {
				jpg++;
			} else if(file.endsWith(".java")) {
				java++;
			} else if(file.endsWith(".hwp")) {
				hwp++;
			} else if(file.endsWith(".doc")) {
				doc++;
			}//endsWith 사용해서 끝나는 문자 확인 해서 수 만큼 해당 변수 값 증가
		}
		System.out.printf("mp3 : %d개\n", mp3);
		System.out.printf("jpg : %d개\n", jpg);
		System.out.printf("java : %d개 \n", java);
		System.out.printf("hwp : %d개 \n", hwp);
		System.out.printf("doc : %d개 \n", doc);
	}//main

}
