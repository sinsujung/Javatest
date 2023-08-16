package com.test.question;

import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		//요구사항] 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		/*
		  조건] 이름을 오름차순 정렬하시오.
		  출력] 입력한 학생은 총 6명입니다.
			1. 아무개
			2. 하하하
			3. 헤헤헤
			4. 호호호
			5. 홍길동
			6. 후후후
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("학생수: ");

		int count = scan.nextInt();
		scan.nextLine();
	
		String [] students = new String[count];
		
		for(int i=0; i < students.length; i++) {
			
		
			System.out.print("학생명: ");
			String name = scan.nextLine();
			
			
			students[i] = name;
			
			
		}
		System.out.println();
		
		for(int i=0; i<students.length-1; i++) {
			for(int j=0; j<students.length -i-1; j++) {
				
				if(students[j].compareTo(students[j+1])>0){
					String temp=students[j];
					students[j] = students[j+1];
					students[j+1] = temp;

					
				}
			}
		
		}
		System.out.printf("입력한 학생은 총 %d명입니다.\n",students.length);
		for(int i = 0; i <students.length; i++) {
			System.out.printf("%d. %s\n", i+1, students[i]);
		}
	}
}//TODO!
