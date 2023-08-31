package com.test.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex78_RegEx {
	
	public static void main(String[] args) {
		
		//Ex78_RegEx.java
		
		//정규 표현식 + 자바 > 적용
		//- 검색(+치환) > replaceAll(), replaceFirst()
		//- 분리 > split()
		//- 유효성 검사 > Pattern, Matcher
		
		
		//1. 정규 표현식 객체 
		//2. 다른 객체의 기능ㄴ 중 > 일부 정규표현식 지원
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
	}//main
	
	private static void m5() {
		
		//유효성 검사
		
		//회원 가입 > 유효성 검사
		//1. 이름 > 필수, 한글, 2~5자 이내
		//2. 이메일 > 필수, 이메일 형식
		//3. 나이 > 필수, 숫자, 18세 이상
		//4. 아이디 > 필수, 영어+숫자+_ 조합가능 , 숫자로 시작 불가능 , 4~12자 이내
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("[회원 가입]");
		
		String name = getData(scan, "이름");
		//유효성 검사
		
		String email = getData(scan, "이메일");
		//유효성 검사
		
		String age = getData(scan, "나이");
		//유효성 검사

		String id = getData(scan, "아이디");
		//유효성 검사

		//일괄 유효성 검사
		 if(isValid(name, email, age, id)) {
			 System.out.println("가입 완료");
		 } else {
			 System.out.println("가입 실패");
		 }
		
	}

	private static boolean isValid(String name, String email, String age, String id) {
		
		//유효성 검사는 잘못된 것을 찾아라 !
//		if(검사) {
//			return false;
//		}
//		
		
		String regex = ""; //정규식
		Pattern p1 = null; //정규식 객체
		Matcher m1 = null;//결과 객체
		
		//1. 이름 > 필수, 한글 , 2~5자 이내
		regex = "^[가-힣]{2,5}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(name); //사용자가 입력한 이름에서 패턴 검색
		
		if(!m1.find()) {
			System.out.println("이름 > 필수, 한글, 2~5자 이내");
			return false;
		}


		//2. 이메일 > 필수, 이메일 형식
		
		regex = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(email); //사용자가 입력한 이름에서 패턴 검색
		
		if(!m1.find()) {
			System.out.println("이메일 > 필수, 이메일 형식");
			return false;
		}

		//3. 나이 > 필수, 숫자, 18세 이상 ~ 100세 이하
		//정규 표현식에서는 범위 표현하기 못함 > 하더라도 자릿수만 확인 할 수 있음 
		
		regex = "^[0-9]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(age); //사용자가 입력한 이름에서 패턴 검색
		
		if(!m1.find() 
				|| (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 100)) {
			System.out.println("나이 > 필수, 18세 이상");
			return false;
		}
		

		//4. 아이디 > 필수, 영어+숫자+_ 조합가능 , 숫자로 시작 불가능 , 4~12자 이내
		regex = "^[A-Za-z_][A-Za-z0-9_]{3,11}$";
		regex = "^[A-Za-z_]\\w{4,12}$";
		
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(id); //사용자가 입력한 이름에서 패턴 검색
		
		if(!m1.find()) {
			System.out.println("나이 >  아이디 > 필수, 영어+숫자+_ 조합가능 , 숫자로 시작 불가능 , 4~12자 이내");
			return false;
		}
		
		return true;
	}

	private static String getData(Scanner scan, String label) {
		// TODO Auto-generated method stub
		System.out.print(label + ": ");
		return scan.nextLine();
		
	}

	private static void m4() {
		
		String txt = "안녕하세요. 홍길동입니다. 네? 당신 이름도 길동이라구요?, 아~ 김길동이요. 저쪽에 최길동도 있습니다. 그리고 남궁길동도 있습니다.";
		
		//요구사항] 모든 길동이 찾기 !!
//		String regex = "[홍김최]?길동";
		String regex = "(홍|김|최|남궁)길동";
		
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while (m1.find()) {
			System.out.println("찾은 이름: " + m1.group());
			System.out.println("성씨: " + m1.group(1));
			System.out.println("이름: " + m1.group(2));
			System.out.println();
		}
	}

	private static void m3() {
		
		//정규 표현식 객체
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-1234-5678입니다. 추가 연락처는 011-9876-5432입니다. 010-1212-3434";
		
		//정규 표현식 객체 생성하기
		//String regex = "[0-9{3}-[0-9]{3,4}-[0-9]{4}]";
		String regex = "(\\d{3})-(\\d{3,4})-(\\d{4})";
		
		//p1 >  정규 표현식 객체
		Pattern p1 = Pattern.compile(regex);
	
		//txt에서 p1의 패턴을 검색해라
		Matcher m1 = p1.matcher(txt);
//		System.out.println(m1.find());//검색 결과
		
//		if(m1.find()) {
//			System.out.println("txt에서 전화번호 발견O");
//		}else {
//			System.out.println("txt에서 전화번호 발견X");
//		}
//		System.out.println(m1.find());//010-1234-5678
//		System.out.println(m1.find());//010-1234-5678
//		System.out.println(m1.find());//X
		
		
		//전화번호 > 총 몇번 발견 ?
//		int count = 0;
//		
//		while(m1.find()) {
//			count++;
//		}
//		System.out.printf("전화번호가 총 %d회 발견되었습니다.\n", count);
//		
//	
		
		while (m1.find()) {
			System.out.println("[전화번호 발견]");
		
			System.out.println("전화번호: " + m1.group(0));
			System.out.println("통신사: " + m1.group(1));
			System.out.println("전화번호 앞자리: " + m1.group(2));
			System.out.println("전화번호 뒷자리: " + m1.group(3));
			
			
			System.out.println();
		}
		
	}

	private static void m2() {
		
		String name = "홍길동,아무개;하하하,,테스트 이순신"; //csv
		
		String[] list = name.split("[,;\s]{1,2}");
		
		for(String item : list) {
			System.out.println(item);
		}
		
	}

	private static void m1() {
		
		//게시판 > 개인 정보 기재 불가(전화 번호) > 마스킹
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-1234-5678입니다. 제 메일은 hong@gmail.com입니다. 추가 연락처는 010-9876-5432입니다.";
//
//		System.out.println(txt.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
//		System.out.println(txt.replaceAll("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}", "OOOO@OOOO"));
		System.out.println();
		System.out.println(
							txt
							.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX")
							.replaceAll("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}", "OOOO@OOOO")
		);
//		System.out.println(txt.replaceFirst("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
		System.out.println();
		
	}

}
