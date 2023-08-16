package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		//요구사항] 지정한 폴더의 특정 파일 (확장자)만을 출력하시오.
		//조건] 확장자 대소문자 구분없이 검색 가능
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더: ");
		String path = scan.nextLine();
		
		System.out.print("확장자: ");
		String ext = scan.nextLine();
		
		File dir = new File(path); //입력 받은 폴더로 파일 객체 생성 
		
		if(dir.exists()) {
			File[] list = dir.listFiles();//listFiles()메서드를 사용하여 폴더 안에 있는 정보를  배열로 만든다 
			for(File f : list) { //list배열에 넣어둔 File 객체를 돌린다
				if(f.getName().toLowerCase().endsWith(ext.toLowerCase()))	{
					System.out.println(f.getName());// 파일명을 소문자로 변환하고 
												//파일 이름이 입력한 확장자로 끝나는지 확인 한다.
												//이것도 소문자 변환 
				}
			}
		}else {
			System.out.println("폴더가 유효하지 않습니다. ");
			
		}
	}//main
}