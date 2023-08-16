package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	
	public static void main(String[] args) {
		
		//요구사항]  지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
		//조건 ] -C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		// -BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		String path1 = "C:\\class\\java\\file\\AAA\\test.txt"; // 경로 변수로 설
		String path2 = "C:\\class\\java\\file\\BBB\\test.txt";
		
		File file1 = new File(path1);//파일 객체 만들
		File file2 = new File(path2);
		
		
		
		if(!file2.exists()) {
			System.out.println("파일 이동을 실행합니다. ");
			file1.renameTo(file2);
			System.out.println("파일 이동을 완료했습니다. ");// 중복 파일 없으면 renameTo메소드로 바로 이동 
		}else {// 중복 파일이 있으면 덮어쓸지 사용자에게 입력 받는다~
			Scanner scan = new Scanner(System.in);
			System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
			String yn = scan.nextLine();
			
			if(yn.equals("y")) {//파일을 삭제하고 경로 이동~
				file2.delete();
				file1.renameTo(file2);
				System.out.println("파일 이동을 완료했습니다.");
			} else {
				System.out.println("작업을 취소합니다. ");
			}
			
			scan.close();
		
		}
		
		
		
	}//main

}
