package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) {
		
		//요구사항] 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		/*
		 	조건]
		 	합격 조건: 3과목 평균 60점 이상
			과락 조건: 1과목 40점 미만
			
			한줄씩 읽으면서 점수가 하나라도 40점 아래면 바로 불합격자 
			한줄씩 읽으면서 그 줄에 있는 숫자 평균값 계산후 60점 이상이면 바로 합격 , 60점 이하면 불합격 
		 	
		 */

		try {
			BufferedReader reader
			= new BufferedReader(new FileReader("/Users/suding/파일_입출력_문제/성적.dat")) ;//BufferedReader  생성하고 FileReader 사용하여 파일 내용 읽기
	
			ArrayList<String> pass = new ArrayList<String>(); //합격 배열 생성
			ArrayList<String> fail = new ArrayList<String>(); //불합격 배열 생성 
			
			
			String line = null;//초기화
			
			
			while((line = reader.readLine()) != null) {//한줄씩 읽어오기 다음 줄이 없을 때까지 , 으로 스플릿해서 temp배열에 저장 
			
				
				String[] temp = line.split(",");
				
				int kor = Integer.parseInt(temp[1]); //String temp 배열 두번째 자리를 국어점수로 저장 ~
				int eng = Integer.parseInt(temp[2]); // 세번째 자리 영어 점수
				int math = Integer.parseInt(temp[3]);//네번째 자리 수학 점수 
		
						
				if((kor + eng + math)/ 3 >= 60 && (kor >= 40 && eng >= 40 && math >= 40)) {
					pass.add(temp[0]);
					}else {
						fail.add(temp[0]);
					}
				}// 합격 조건 새워주고 합격이면 첫번째 자리인 이름 합격 배열에 저장 조건에 해당 안하면 불합격자로 이름 저장~
			reader.close();
			
			System.out.println("[합격자]");
			
			for(String name : pass) {
				System.out.println(name); //합격자 이름 출력 
			}
			System.out.println();
			System.out.println("[불합격자]");
			
			for(String name : fail) {
				System.out.println(name); //불합격자 이름 출력 
			}
		}catch (Exception e) {
			System.out.println("Q122.main()");
			e.printStackTrace();
		}
		
	}//main
}
