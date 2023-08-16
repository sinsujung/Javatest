package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	

	public static void main(String[] args) {
		
		//요구사항] 파일의 경로를 입력받아 파일 정보를 출력하시오.
		//조건] 파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB

		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일 경로: ");
		String route = scan.nextLine();
		
		File file = new File(route);// 파일명, 파일 종류, 파일 크기 출력.
		if(file.exists()) {// 파일이 존재하면 
			
			System.out.printf("파일명: %s\n", file.getName());
			System.out.printf("종류: %s 파일\n", file.getName().substring(file.getName().lastIndexOf(".")+1));
			System.out.printf("파일 크기:%s\n",getSize(file.length()));//getSize메소드 따로 만들어서 불러온 뒤 파일 크기  출력 
		}
	}
	
		private static String getSize(long length) { // 
			
			if(length < 1024) {
				return length + "B";
			}else if (length <1024*1024) {
				return String.format("%.1f", length/1024)+"KB";
			}else if (length <1024*1024*1024) {
				return String.format("%.1f", length/1024/1024)+"MB";
			}else if (length <1024*1024*1024*1024) {
				return String.format("%.1f", length/1024/1024/1024)+"GB";
			}else {
				return String.format("%.1f", length/1024/1024/1024/1024)+"TB";
		
		}


	}//mian
	
	

}

