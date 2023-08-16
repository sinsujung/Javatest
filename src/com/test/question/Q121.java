package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {

	public static void main(String[] args) {
		
		//요구사항] 숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.
		/*
		 	조건]
			0 → 영, 1 → 일 ... 9 → 구
			저장할 파일명: 숫자_변환.dat
		*/
		
		try {
			BufferedReader reader
			= new BufferedReader(new FileReader("/Users/suding/파일_입출력_문제/숫자.dat")) ;//BufferedReader  생성하고 FileReader 사용하여 파일 내용 읽기
			BufferedWriter writer
			= new BufferedWriter(new FileWriter("/Users/suding/파일_입출력_문제/숫자_변환.dat)"));//BufferedWriter 생성하고 FileWriter 사용하 파일에 내용 쓰기
		
			String line = null;//초기화 
			String [] kor = {"영","일","이","삼","사","오","육","칠","팔","구"};//한글 배열에 저장 
			
			while((line = reader.readLine()) != null) {//한줄씩 읽어오기 다음 줄이 없을 때까지 루프 돌리면서 숫사를 한글로 바꾸기 
				for (int i = 0; i <10; i++) {
					String numberStr = Integer.toString(i); // 숫자 문자열로 변환
					String korNumber = kor[i];// 해당 숫자에 맞는 한글 문자열에 저장 
					line = line.replace(numberStr, korNumber);// 숫자를 한글로 바꾼다.

				}
				writer.write(line);//변경된 내용을 작성 

			}
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른이름으로 저장하였습니다.");
			
			
		}catch(Exception e) {
			System.out.println("Q121.main()");
			e.printStackTrace();
		}
		
		
		
	}//main

}
