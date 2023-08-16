package com.test.question;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class Q120 {
	
	public static void main(String[] args) {
		
		//요구사항] 특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
		/*
		 	 조건]
		 	 '유재석' → '메뚜기'
			저장할 파일명: 이름수정_변환.dat
		 */
		try {
			BufferedReader reader
			= new BufferedReader(new FileReader("/Users/suding/파일_입출력_문제/이름수정.dat")); //BufferedReader  생성하고 FileReader 사용하여 파일 내용 읽기
			BufferedWriter writer
			= new BufferedWriter(new FileWriter("/Users/suding/파일_입출력_문제/이름수정_변환.dat"));//BufferedWriter 생성하고 FileWriter 사용하 파일에 내용 쓰기
			
			String line = null; // 초기화 
	
			
			while((line = reader.readLine()) != null){ //한줄씩 읽어오기 다음 줄이 없을 때까지 루프 돌리면서 유재석을 메뚜기로 바꾸기 
				line = line.replace("유재석","메뚜기");
			}
			writer.write(line);//변환된 내용을 파일에 작성 
		
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			System.out.println("Q120.main()");
			e.printStackTrace();
		}
		
		
		
	}//main

}
