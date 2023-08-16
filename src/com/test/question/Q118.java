package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {

	public static void main(String[] args) {
		
		//요구사항]폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
		/*
		  	조건]
		  	자식 폴더내의 파일도 모두 검색하시오.
			부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
		  	
		 */

		File dir = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\크기 정렬");

		ArrayList<File> flist = new ArrayList<File>();
			
		addFile(dir, flist);

		for(int i=0; i<flist.size()-1; i++) {
			for(int j=0; j<flist.size()-i-1; j++) {
				if(flist.get(j).length() < flist.get(j+1).length()) {
					File temp = flist.get(j);
					flist.set(j, flist.get(j+1));
					flist.set(j+1, temp);
				}
			}
		}
			System.out.printf("%-33s%s\t%10s\n","[파일명]","[크기]","[파일이 들어있는 폴더]");
			
			for(File file : flist) {
				System.out.printf("%-30s\t%10s\t%s\n"
								,file.getName()
								, getSize(file.length())
								, file.getParentFile().getName());
			}
				
			
	}// main

	private static Object getSize(long length) {
		

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
	}

	private static void addFile(File dir, ArrayList<File> flist) {
		
		File[] list = dir.listFiles();
		
		for(File file : list ) {
			if(file.isFile()) {
				flist.add(file);
			}
			
		}
		
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				addFile(subdir,flist);
			
			}
		}
	}

}
