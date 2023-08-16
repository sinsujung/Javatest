package com.test.question;

import java.io.File;

public class Q115 {
	
	public static void main(String[] args) {
		
		//요구사항]파일의 크기가 0byte인 파일만 삭제하시오.
		
		File dir = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\파일 제거");
		
		int count = 0;
		File[] list = dir.listFiles();
		
		for(File file : list) {
			if(file.length() == 0) {
				file.delete();
				count++;
			}
		}

	System.out.printf("총 %d개의 파일을 삭제했습니다.",count);
	
	}//main
	
}
