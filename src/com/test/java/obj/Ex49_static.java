package com.test.java.obj;

public class Ex49_static {

	public static void main(String[] args) {
		
		//Ex49_static.java
		
		//요구사항]
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		//Case 1.
		//- Pen 객체(클래스)와  count 간의 관계 약함.
		//- 오차 발생(count++ 누락)
		//- 
//		int count = 0;
//		
//		Pen p1 = new Pen("MonAmi", "black");
//		count ++;
//		
//		Pen p2 = new Pen("MonAmi", "black");
//		
//		Pen p3 = new Pen("MonAmi", "black");
//		count ++;
//		
//		System.out.println("펜 개수: " + count);
		
		
		//Case 2.
		//- Pen과 count간의 결합 > 강하게
		//- 객체 변수 > 여러개 발생
		//- 그 중 1개 사용 > 왜 그 객체의 count 사용하는지? 당위성이 없다.
//		
//		Pen p1 = new Pen("MonAmi", "black");
//		p1.count++;
//		
//		Pen p2 = new Pen("MonAmi", "black");
//		p1.count++;
//		
//		Pen p3 = new Pen("MonAmi", "black");
//		p1.count++;
//		
//		System.out.println("펜 개수: " + p1.count);
		
		
		//Case 3.
		//- Pen과 count 간의 관계 > 강하기
//		//- count 변수 딱 1개 만들자!!
//		Pen p1 = new Pen("MonAmi", "black");
//		Pen.count++;
//
//		Pen p2 = new Pen("MonAmi", "black");
//
//		Pen p3 = new Pen("MonAmi", "black");
//		Pen.count++;
//		
//		System.out.println("펜 개수: " + Pen.count);

		
		//Case 4.
		Pen p1 = new Pen("MonAmi", "black");
		Pen p2 = new Pen("MonAmi", "black");
		Pen p3 = new Pen("MonAmi", "black");
		
		System.out.println("펜 개수: " + Pen.count);
	}
}

class Pen {
	
	//public int count = 0;
	public static int count = 0;
	
	private String model;
	private String color;
	
	
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}

	@Override
	public String toString() {
		
		return "Pen [model=" + model + ", color=" + color + "]";
	}


	



	
}


















