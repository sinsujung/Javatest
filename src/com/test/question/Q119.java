package com.test.question;

import java.io.File;

public class Q119 {

	public static void main(String[] args) {
		
		//파일을 폴더별로 분류/이동하시오
		
		File dir = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\직원");
		
		File[] list = dir.listFiles();
		
		for(File f: list) {
			
			//파일이름 패턴
			
			
		String[] temp = f.getName().split("_");
		
		String name = temp[0];
		String year = temp[1];
		
		File nameDir = new File(dir.getAbsolutePath() + "\\" + name);
		nameDir.mkdir();
			
		File yearDir = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year);
		yearDir.mkdir();
		
		File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year+ "\\" + f.getName());
		
		f.renameTo(dest);
		
		
		
		
		}
	}//main 
}
