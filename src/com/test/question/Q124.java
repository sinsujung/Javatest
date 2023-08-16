package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Q124 {
	
	public static void main(String[] args) {
		
		//요구사항] 이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.
		/*
		  	출력]
		  	==== 구매내역 ==== 
[번호]    [이름]    [상품명]    [개수]    [배송지]
  3      홍길동     마우스       3    서울시 강동구 천호동
		 */
		
		try {
			BufferedReader reader1 = new BufferedReader(
					new FileReader("/Users/suding/파일_입출력_문제/검색_회원.dat"));

			BufferedReader reader2 = new BufferedReader(
					new FileReader("/Users/suding/파일_입출력_문제/검색_주문.dat"));// BufferedReader 생성하고 FileReader
																						// 사용하여 파일 내용 읽기

			Scanner scan = new Scanner(System.in);

			System.out.print("이름: ");
			String inputname = scan.nextLine();

			String line = null;
			String membernum = "";
			String address = ""; //나중에 출력해줄 때 루프가 달라서 변수로 지정 해줌 

			while ((line = reader1.readLine()) != null) { //검색 회원에서 한줄씩 읽어오기 다음 줄이 없을 때까지 , 으로 스플릿해서 temp배열에 저장 

				String[] temp = line.split(",");

				if (temp[1].equals(inputname)) {// 회원 이름이 내가 입력한 이름과 같으면, 회원번호와 주소를 temp에 저장~ 
					membernum = temp[0];
					address = temp[2];
					break;
				}

			}

			if (!membernum.equals("")) {//만약 회원 번호가 공백이 아니면 
				System.out.println("========== 구매내역 ===========");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");

				while ((line = reader2.readLine()) != null) { //검색 주문 파일에서 한줄씩 읽어오고 스플릿 해서 temp에 저장한다~ 

					String[] temp = line.split(",");

					if (temp[3].equals(membernum)) {// 검색주문의 회원번호와 검색회원의 회원번호가 같으면 회원번호, 이름, 상품명, 개수, 배송지출력~ 

						System.out.printf("%s\t%s\t%s\t%s\t%s\r\n", temp[3], inputname, temp[1], temp[2], address);
					}
				}
			}
			scan.close();
			reader1.close();
			reader2.close();
		} catch (Exception e) {
			System.out.println("Q124.main()");
			e.printStackTrace();
		}
	}// main

}
