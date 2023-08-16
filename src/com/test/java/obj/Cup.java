package com.test.java.obj;

public class Cup {

	private String color;
	private int size;
	
	/*
	 
	 컴파일러가 자동으로 생성하는 코드 > 기본(default) 생성자
	 개발자가 직접 생성자를 구현하면, 컴파일러는 생성자를 안만들어준다.
	 
	 1. 메소드명이 클래스명과 동일하다.(반드시 일치)
	 2. 반환형이 생략되어 있다. > 반환값을 가질 수 없다. > 무조건 void라 생략하는 것이다.
	 3. 구현부 > 일반 메소드
	 
	 
	*/
	public Cup() {
		
		//*** 생성자의 역할
		// - 멤버를 초기화하는 전용 메소드
		// - 방금 new가 만든 갓 태어난 객체를 초기화하는 역할
		//this.color = "yellow";
		//this.size = 300;
		this("yellow", 300);
	}
	//생성자 오버로딩
	public Cup(String color) {
//		this.color = color;
//		this.size = 300;
		this(color, 300);
	}
	
	public Cup(int size) {
		
		//this.size = size;
//		if(size > 0 && size < 3000) {
//			this.size = size;
//		}
		this("yellow", size); //생성자 위임
	}
	
	public Cup(String color, int size ) {
		this.color = color;
		
		if(size > 0 && size < 3000) {
			this.size = size;
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String info() {
		
		return "색상: " + this.color + ", 크기: " + this.size;
	}
}









