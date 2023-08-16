package com.test.question;

import java.util.Arrays;

public class Q063 {
	
	public static void main(String[] args) {
		
		//요구사항] int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
		//조건] String dump(int[] list)
		//출력] nums = [ 10, 20, 30, 40 ] 
		
		
		
		int[]list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;//배열 선언
		
		//System.out.println(Arrays.toString(list));
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
		
	}//main

	private static String dump(int[] list) {
		String temp = "["; // 문자열 변수 생성
		
		for(int i=0; i<list.length; i++) {
			
			temp += list[i]; // list[0]부터 list[4]까지 문자열 변수 temp에 추가
			
			if(i < list.length-1) {
				temp += ",";
			}//배열의 마지막 값 전까지 문자열에 쉼표 추가
			
		}
		
		temp +="]"; 
		
		return temp; //뚜껑 닫고 리턴 후 출력
	}
}
