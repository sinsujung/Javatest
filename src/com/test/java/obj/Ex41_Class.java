package com.test.java.obj;

public class Ex41_Class {

	public static void main(String[] args) {
		
		//Ex41_Class.java
		
		//Pencil, PencilCase
		
		Pencilcase pcase = new Pencilcase();
		
		pcase.setColor("파란색");
		/*
		for(int i=0; i<5; i++) {
			
			Pencil p1 = new Pencil();
			p1.setHardness("HB");
			p1.setColor("검은색");
			
			//[index] : 인덱서(Indexer) - 표기법
			pcase.getPencil()[i] = p1;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(pcase.getPencil()[i].info());
		}
		*/
		
		for(int i=0; i<5; i++) {
			Pencil p = new Pencil();
			p.setHardness("B");
			p.setColor("파란색");
			
			pcase.add(p);
		}
		System.out.println(pcase.info());
		
		Pencil p2 = pcase.get(2);
		
		System.out.println(pcase.info());
	
		
		//5cm~15cm
		//1mm~20mm
		
		//red, blue, yellow, white, pink, purple, green, black
		
		String[]color = {"red", "blue", "yellow", "white", "pink",
				"purple", "green", "black"};
		
		//색상 > 난수화(X)
		//방번호 > 난수 가능~
		
		System.out.println(color[(int)(Math.random() * color.length)]);
	}
}



















