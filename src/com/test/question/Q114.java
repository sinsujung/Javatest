package com.test.question;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
	
	public static void main(String[] args) {
		
		//요구사항] 이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		
		/*
		 	
		 	조건]
		 	새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
			'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		 	
		 */
		//목록
		File dir = new File("C:\\Users\\user\\Desktop\\q\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[]list = dir.listFiles();
		
		//키 > 확장자
		//값 > 카운트
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for(File f : list) {
			//System.out.println(f.getName());
			String ext = getExtension(f.getName());
			
			if(!count.containsKey(ext)) {
			count.put(ext,1); //"gif",1// 새로운 확장자 등록
			}else {
				count.put(ext, count.get(ext)+1);//count = count +1 누적
			}
		}
		System.out.println(count);
	}
	private static String getExtension(String name) {
		//test.png
		//test.test.png
		String[] temp = name.split("\\.");
		//System.out.println(temp.length);
		String ext = temp[temp.length-1].toLowerCase();
		
		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		//return ext;
		
		return name.split("\\.")[temp.length-1].toLowerCase();
		
		
		
		
		
		
		
		
		
		
//		String path = "/Users/suding/파일_디렉토리_문제/확장자별 카운트";
//		File dir = new File(path);
//		HashMap<String,Integer> count = new HashMap<String, Integer>();
//		
//		File[]list = dir.listFiles();
//		
//		for(File f : list) {
//			String ext = f.getName().substring(f.getName().lastIndexOf(".")+1);
//		
//			if(count.get(ext) == null) {
//				count.put(ext,0);
//			}else {
//				count.put(ext,count.get(ext)+1);
//			}
//		}
//		
//		Set<String> keys = count.keySet();
//		
//		for(String key : keys) {
//			System.out.printf(".%s: %d개\n", key, count.get(key));
//		}
	}//main

}
