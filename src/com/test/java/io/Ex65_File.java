package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {

	// 경로를 멤버 정적 상수로 만들어 두기(오타 방지)
	public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";

	public static void main(String[] args) {

		// Ex65_File.java

		/*
		 * //인코딩 디코딩 > 데이터 깨짐 배우려고~ 파일 입출력 - 응용프로그램 <- (데이터) ->저장장치
		 * 
		 * 저장장치 - 데이터 1,0으로 저장 - 데이터의 자료형 존재 X > 모두 다 문자
		 * 
		 * 인코딩, Encoding - 문자 코드(자바 데이터)를 부호화(1,0) 시키는 작업 - 자바 프로그램("홍길동") > 텍스트
		 * 파일(100100100110110)
		 * 
		 * 디코딩, Decoding - 부호화 데이터를 문자 코드로 변환하는 작업 - 텍스트 파일(100100100110110) > 자바
		 * 프로그램("홍길동")
		 * 
		 * 인코딩/디코딩 규칙 1. ISO-8859-1 2. EUC-KR 3. ANSI 4. MS949 5. UTF-8 6. UTF-16 7.
		 * ASCII
		 * 
		 * 
		 * ANSI(ISO-8859-1, EUC-KR, MS949) 1. 영어(숫자, 특수문자, 서유럽 등) : 1byte 2. 한글(한자, 일본어
		 * 등) : 2byte//한글이 깨짐
		 * 
		 * UTF-8(Unicode) *****무조건 이걸 사용 > 국제 표준 1. 영어: 1byte 2. 한글: 3byte//한글이 깨짐
		 * 
		 * UTF-16(Unicode) 1. 영어: 2byte 2. 한글: 2byte//한글이 깨짐
		 * 
		 * 
		 * 
		 */
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
		
	}// main
	
	private static void m8() {
	
		try {
			
			BufferedReader reader
				= new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\q\\Ex63_HashSet.java"));
			
			String line = null;
			int n = 1; 
			
			while((line = reader.readLine()) != null) {
				System.out.printf("%3d: %s\n", n, line);
				n++;
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m8");
			e.printStackTrace();
		}
	}
	
	
	private static void m7() {
		
		//메모장 쓰기
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			BufferedWriter writer = new BufferedWriter
					(new FileWriter("C:\\class\\code\\java\\file\\" + filename + ".txt"));
			
					boolean loop = true;
					
					while (loop) {
						
						System.out.print("입력: ");
						String line = scan.nextLine();
						
						if(line.equals("exit")) {
							break;
						}
						
						writer.write(line);//한줄 입력(scan) > 한줄 쓰기(writer)
						writer.write("\r\n");
						
					}
			
					writer.close();
					
					System.out.println("파일 저장 완료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m7");
			e.printStackTrace();
		}
		
		
	}
	private static void m6() {
		
		try {
			
			BufferedReader reader 
				= new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader2
				= new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt"));
			
			//- reader2.read()
			//- reader2.readLine()
			
//			String line = reader2.readLine();
//			System.out.println(line);
		
			String line = null;
			
			while((line = reader2.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m6");
			e.printStackTrace();
		}
		
	}
	private static void m5() {
		
		//쓰기
		//-FileOutputStream > FileWriter > BufferedWriter
		
		//읽기
		//- FileInputStream > FileReader > BufferedReader
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\memo.txt"));
			
			writer.write("하나");
			writer.write('A');
			writer.write("\r\n");
			writer.write("둘");
			writer.newLine();
			writer.write("셋");
			
			
			writer.close();
			
			System.out.println("종료");
		} catch (Exception e) {
			System.out.println("at Ex65_File.m5");
			e.printStackTrace();
		}
		
	}

	
	
	private static void m4() {
		
		try {
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\member.txt");
			
//			int code = reader.read();
//			
//			System.out.println((char)code);//한글자씩 읽어준답니다~
			
			int code = -1;
			
			while((code = reader.read())!= -1) {
				System.out.print((char)code);
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m4");
			e.printStackTrace();
		}
		
		
	}

		
		
		private static void m3() {
		
		// 쓰기는 FileInputStream > FileWriter
		// 읽기는 FileInputStream > FileReader
		
		try {
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			
			//writer.write(65);
			//writer.write("ABC");
			
			writer.write("홍길동");
			
			writer.close();
			
			//다시쓰고 싶으면 다시 열어야지 ㅡㅡ
			//다시열기
			writer = new FileWriter("C:\\class\\\\code\\java\\file\\member.txt");
			
			writer.write("아무개");
			
			writer.close();
			
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		try {
			
			//파일 읽기
			//-FileInputStream
			
			//읽기 스트림 객체
			FileInputStream stream = new FileInputStream(FILE);
			
			int code = -1;
			
			while((code = stream.read()) != -1) {
				
			System.out.print((char)code);
			
			}//***********이 유형의 루프 많이쓰니까 외워~
			System.out.println();
			
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {

		// 파일 쓰기
		// - 스트림 객체
		// FileOutputStream

		// 쓰기 스트림 객체
		// 1. 생성 모드, Create mode > 덮어쓰기 > 더 많이 사용!!
		// - 기본값
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면 항상 덮어쓰기를 한다.

		// 2. 추가 모드, Append mode > 기존 내용 > 이어쓰기
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면 항상 이어쓰기를 한다.

		// 생성모드던 추가모드던 항상 파일이 없으면 자동으로 만듬
		try {

			File file = new File("C:\\class\\code\\java\\file\\member.txt");// 파일이 없으면 자동으로 생성됌

			// 스트림 객체 생성 > 스트림 열기
			// FileOutputStream 얘는 바이트 단위 쓰기임 (1byte)
			FileOutputStream stream = new FileOutputStream(file, true); // > 이어쓰기 하려면 file 뒤에 true 넣어야함

			// stream.write('홍'); //A > 문자 코드 값
			// stream.write('길');
			// stream.write('동'); // > 덮어쓰기 됌

			String txt = "Hello~ Hong!!";

			for (int i = 0; i < txt.length(); i++) {
				stream.write(txt.charAt(i));
			}

			// 스트림 닫기
			// - 저장이 안된다.
			// - 잠긴파일이 된다
			stream.close();// 저장장치에 바로 저장하면 엄청 오래걸립니다~ 그래서 메모리에 다 저장하고 한번에 저장장치로 이동~ close()

			System.out.println("종료");

		} catch (Exception e) {
			System.out.println("at Ex65_File.m1");
			e.printStackTrace();
		}

	}
}
