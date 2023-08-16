package com.test.java.obj.inheritance;

public class Ex58_Gerneric {
	
	public static void main(String[] args) {
		
		//Ex58_Generic.java
		
		//Item is a raw type. 
		//References to generic type Item<T> should be parameterized
		
		//Item item = new Item();
		Item<String> item = new Item<String>();//꺽쇄 안에 우리가 쓰는 자료형을 쓰면 됌
		item.c ="문자열";
		
		Item<Integer> item2 = new Item<Integer>();
		item2.c = 100;
		//Item<int> item2 = new Item<int>();// 값형은 들어갈 수 없음

		Pen<Boolean> pen = new Pen<Boolean>();
		pen.a = true;
		pen.b = false;
		pen.c = true;
		
		
		Note<String,Integer> note = new Note<String, Integer>("홍길동", 20);
		
		System.out.println(note.getA());// String
		System.out.println(note.getB()); //Integer
		
		
	}

}

// 제네릭 클래스
// - T: 타입 변수(메소드의 매개변수 역할)/타입의 약자T > 자료형을 전달하는 변수 > 반드시 참조형만 가능
//- <>: 인자 리스트(메소드의 () 역할)
class Item<T>{//꺽쇄 안에 우리가 쓰는 자료형을 쓰면 됌//위에서 String으로 지정 해줘서 현재 T는 String
	
	public int a;
	public int b;
	public T c;// 클래스 선언까지는 결정(x) > 객체를 생성할 때 결정(o)
	
}


class Pen <T>{
	
	public T a;
	public T b;
	public T c;
	
}

class Desk<T> {
	
	public T a; //멤버 변수의 자료형
	
	public void set(T a)	{ //메소드 매개변수의 자료형
		this.a = a;
		
		T b; //지역변수의 자료형 > 비권장.. 잘 안씀
		
	}
	
	public T get() { //메소드 반환타입
		return this.a;
	}
}

class Note<T,U> { //<>안에 대소문자 안가림, 꼭 한글자가 아니여도 되지만 대부분 한글자로 함
				//타입변수의 수가 많아도 되는데 어려워서 보통 2개까지만 씀
	
	public T a;
	public U b;
	
	public Note(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA()	{
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
	
}















