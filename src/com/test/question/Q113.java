package com.test.question;

import java.io.File;

public class Q113 {

	public static void main(String[] args) {

		// 요구사항] 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
		// 조건] '001'부터 3자리 형식으로 붙이시오.

		String path = "C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\음악 파일";

		File dir = new File(path);
		int number = 1;

		File[] list = dir.listFiles();

		for (File file : list) {

			if (file.getName().substring(file.getName().lastIndexOf(".") + 1).toLowerCase().equals("mp3")) {

				File temp = new File(path + "\\" + String.format("[%03d]%s", number, file.getName()));
				file.renameTo(temp);
				number++;
			}
		}
		System.out.println("complete");
	}// main

}
