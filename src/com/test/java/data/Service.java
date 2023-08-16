package com.test.java.data;

import java.util.Scanner;

public class Service {

	public static void add() {
		
	View.subTitle("학생 추가하기");
		
	//업무 > 학생추가
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("학년: ");
	String gradeNo = scan.nextLine();
	
	System.out.print("반: ");
	String classNo = scan.nextLine();
	
	System.out.println("이름: ");
	String name = scan.nextLine();
	
	//일련번호 > 모든 일련번호 중 가장 큰 숫자를 얻어야함 
	String maxNo = Data.list.stream()
					.map(s -> s.getNo())
					.max((a, b) -> Integer.parseInt(a) - Integer.parseInt(b))
					.get();
	
	int no = Integer.parseInt(maxNo) + 1;
	
	//번호
	String maxStudentNo = Data.list.stream()
					.filter(s -> s.getGradeNo().equals(gradeNo))
					.filter(s -> s.getClassNo().equals(classNo))
					.map(s -> s.getStudentNo())
					.max((a, b) -> Integer.parseInt(a) - Integer.parseInt(b))
					.get();
	
	int studentNo = Integer.parseInt(maxStudentNo) + 1;
	
	Student s 
		= new Student(no + "", name, gradeNo, classNo, studentNo+ "");
	
	Data.list.add(s);//새로운 학생 추가
	
	System.out.println("학생이 추가되었습니다.");
	
	
	View.pause();
	
	}

	public static void list() {

		View.subTitle("학생 목록보기");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학년: ");
		String gradeNo = scan.nextLine();
		
		System.out.print("반: ");
		String classNo = scan.nextLine();
		
		System.out.println();
		System.out.println("[일련번호]\t[이름]\t[번호]");
		
		for(Student s : Data.list) {
			if(s.getGradeNo().equals(gradeNo)
					&& s.getClassNo().equals(classNo)) {
				System.out.printf("%s\t%s\t%s\r\n"
									,s.getNo()
									,s.getName()
									, s.getStudentNo());
				
			}
				
		}
		
		View.pause();
	}

	public static void delete() {
	
		View.subTitle("학생 삭제하기");
		
		//업무 > 학생 삭제
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학년: ");
		String gradeNo = scan.nextLine();
		
		System.out.print("반: ");
		String classNo = scan.nextLine();

		System.out.print("번호: ");
		String studentNo = scan.nextLine();

		for (Student s : Data.list) {

			if (s.getGradeNo().equals(gradeNo) 
					&& s.getClassNo().equals(classNo)
					&& s.getStudentNo().equals(studentNo)) {
				Data.list.remove(s);
				break;
			}

		}

		View.pause();

	}

}
