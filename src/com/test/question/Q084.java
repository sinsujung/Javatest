package com.test.question;

public class Q084 {
	
	public static void main(String[] args) {

		//요구사항] 특정 단어가 문장 내에 몇회 있는지 수를 세시오.
		/*
		 	조건]
		 	대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
			검색 문자열: String word = "길동";
		 */
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int index = -1;
		int count = 0;
		
		while((index =content.indexOf(word, index)) > -1) {
			//길동을 처음 만난 인덱스를 반환하고 길동을 발견하지 못하면 -1을 반환
			//index에는 길동을 만난 위치를 저장 
				count++;
				index = index + word.length();
				//인덱스에다가 글자의 길이를 더해 루프를 돌며 다음 길동을 찾는다.
				
		}
		System.out.printf("'%s'을 총 %d회 발견했습니다.",word,count);
	}//main

}
