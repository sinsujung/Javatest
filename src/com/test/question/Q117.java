package com.test.question;

import java.io.File;

public class Q117 {

	public static void main(String[] args) {
		
		//내용있는 폴더 삭제하기
		File dir = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\파일 제거");
		
		//탐색
		delete(dir);
		
		System.out.println("종료");
	}

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		for(File f: list) {
			if(f.isFile()) {
				f.delete();
			}
		}
		
		for(File d : list) {
			if(d.isDirectory()) {
				delete(d);
			}
		}
		dir.delete();
		
	}
	
}



















