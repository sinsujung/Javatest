package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {

	public static void main(String[] args) {
		
		//Ex55_Generic.java
		
		//클래스
		//1. 클래스
		//2. 인터페이스
		//3. 추상클래스
		//4. enum
		//5. 제네릭 클래스
		
		//요구사항] 클래스 설계
		//1. 멤버 변수 선언 > int 
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		//추가사항] String을 중심으로 하는 클래스 설계 + 나머지 업무 동일
		//추가사항] boolean을 중심으로 하는 클래스 설계 + 나머지 업무 동일		
		//추가사항] double을 중심으로 하는 클래스 설계 + 나머지 업무 동일
		//추가사항] byte을 중심으로 하는 클래스 설계 + 나머지 업무 동일
		//추가사항] Calendar을 중심으로 하는 클래스 설계 + 나머지 업무 동일
		//추가사항] Student을 중심으로 하는 클래스 설계 + 나머지 업무 동일
		//추가사항] 무한대..
		
		//위의 문제점 > 해결 방안
		//1. Object 클래스 > 오래된 방식 ~ 현재 방식
		//2. 제네릭 클래스 > 최신 방식(2014) ~ 현재 방식 	// > Object의 장점을 그대로 가지고 가고 Object의 단점을 어느정도 해소해주는
		
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData()*2);
		System.out.println();
	
		WrapperObject n2 = new WrapperObject(200); // 박싱이라는 작업이 일어나서 들어가짐
		System.out.println(n2.toString());
		System.out.println((int)n2.getData() * 2); //주소값을 정수 int 다운캐스팅하면 연산가능해짐
		System.out.println();
		
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData() * 2);
		System.out.println();
		
		WrapperString s1 = new WrapperString ("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2.toString());
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		Wrapperboolean b1 = new Wrapperboolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.toString());
		System.out.println((boolean)b2.getData() ? "참":"거짓");
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" :"거짓" );
		System.out.println();
		
		//*** 절대적으로 값형과 참조형간에 형변환은 불가능하다!!
		//값형으로 태어난 모든 변수는 주솟값 저장 x
		//주소값형으로 태어난 모든 변수는 값 저장 x
		//모든 주소를 저장하는 참조변수는 자료형이 int이다// 하지만 자료형이 int로 같아도 값형과 주소값은 담을 수 있는게 달라
		
		
		//Object  변수 == 만능 주머니(모든 자료형을 담을 수 있는 변수)
		
		Object o1 = new Object();
		Object o2 = new Hong(); //업캐스팅
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "홍길동";
		//--------------------------아래는 값형
		//박싱(Boxing) > 오토박싱
		Object o6 = 10; // = new Integer(10); 
		Object o7 = true;
		
		//System.out.println(o6 * 2); //주소값에 2를 곱하는 것. 주소 값은 데이터가 아니기 때문에 연산불가
		System.out.println((Integer)o6 * 2); // 다운캐스팅 // 내부적으론 언박싱(Unboxing)
		System.out.println((int)o6 * 2); // 다운캐스팅
		
		
		
//		Integer num = new Integer(10);
//		System.out.println(num);
//		System.out.println(num + 10);
		
		
		//((Scanner)o3).nextLine();
		
		//Object를 썼을 때의 단점 - 뭐가 들었는지 알아내기가 귀찮다 (오류발생 가능성 증가)
	
		//((Scanner)o4).nextLine();
		
		
	}//main
	
}

class WrapperInt {
	
	private int data; //1. 클래스 중심
	

	//2. data 중심 > 행동
	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return " [data=" + data + "]";
	}
}

class WrapperString {
	
	private String data; //1. 클래스 중심
	
	
	//2. data 중심 > 행동
	public WrapperString(String data) {
		this.setData(data);
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return " [data=" + data + "]";
	}
}
class Wrapperboolean {
	
	private boolean data; //1. 클래스 중심
	
	
	//2. data 중심 > 행동
	public Wrapperboolean(boolean data) {
		this.setData(data);
	}
	
	public boolean getData() {
		return data;
	}
	
	public void setData(boolean data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return " [data=" + data + "]";
	}
}





class WrapperObject {
	
	private Object data ; //*** 모든 자료형을 넣을 수 있는 (int, String, boolean 등)
	

	public WrapperObject(Object data) {
		this.setData(data);
		
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WrapperObject [data=" + data + "]";
	}
	
}

//제네릭버전
class Wrapper<T> {
	
	private T data; //<>안이 타입이라 data는 T타입
	
	public Wrapper(T data) {//타입변수는 <> 안붙임
		this.setData(data);
		
	}


	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
}















