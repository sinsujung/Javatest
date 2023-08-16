package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q116 {

	public static void main(String[] args) {

		// 요구사항] MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.

		File dir1 = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File dir2 = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\동일 파일\\MusicB");

		File[] list1 = dir1.listFiles();
		File[] list2 = dir2.listFiles();

		ArrayList<File> flist = new ArrayList<File>();

		for (File file1 : list1) {

			for (File file2 : list2) {

				if (file1.getName().equals(file2.getName())) {

					flist.add(file1);
				}
			}
		}
		for (File file : flist) {
			System.out.println(file.getName());
		}

	}// main
}
