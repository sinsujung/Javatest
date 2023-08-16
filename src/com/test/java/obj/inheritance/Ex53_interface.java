package com.test.java.obj.inheritance;
public class Ex53_interface {

	public static void main(String[] args) {
		
		//Ex53_interface.javaa

		
		MxKeys keyboard = new MxKeys();
		
		keyboard.powerOn();
		keyboard.keyDown('A');
		System.out.println(keyboard.checkBatter());
		keyboard.powerOff();
	}
	
}

//*** Keyboard는 객체를 생성할 수 없다. > 실체화할 수 없다. > 
interface Keyboard {//인터페이스가 가지는 모든 행동들은 public 
	
	//키보드로서 갖추어야할 행동들 정의(선언부(O), 구현부(X)) > 호출 사용법
	 void keyDown(char c);
	 void powerOn();
	 void powerOff();
	 int checkBatter();
	 //static void aaa(); 스태틱 못붙여요~~
	 
	
}

class MxKeys implements Keyboard{

	@Override
	public void keyDown(char c) {
		//구현 ? > 자기 맘대로~
		System.out.println(c + "눌렀음");
		
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public int checkBatter() {
		
		return 80;
	}
}


	






























