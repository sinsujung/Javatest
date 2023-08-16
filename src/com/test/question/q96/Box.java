package com.test.question.q96;

public class Box {
	/*
	 * Box 객체의 정보 
	 * 1Box에는 10개의 마카롱을 담을 수 있다.(멤버 변수 = Macaron 배열) Box 객체의 사용 Box 객체를
	 * 생성시 Box에 마카롱 객체를 10개 담는다.(무작위) 품질 검사에 통과하지 못하는 마카롱을 구분한다.
	 * 
	 * Macaron 객체의 정보
		생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
		생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
		생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)
	 */

	private Macaron[] list = new Macaron[10];

	public void cook() {
		
		String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		for(int i=0; i < list.length; i++) {
			Macaron m = new Macaron();
			
			m.setSize((int)(Math.random() * 11) + 5);
			m.setColor(color[(int)(Math.random() * color.length)]);
			m.setThickness((int)(Math.random() * 20) + 1);
			
			this.list[i] = m;
		}
		System.out.printf("마카롱을 %d개 만들었습니다.\n", this.list.length);
		System.out.println();
	}

	public void check() {
		
		int pass = 0;
		int failed =0;
		
		for(int i=0; i<list.length; i++) {
			Macaron m = this.list[i];
			
			if(check(m)) {
				pass++;
			} else {
				failed++;
			}
		}
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수: %d개\n", pass);
		System.out.printf("QC 불합격 개수: %d개", failed);
		System.out.println();
	}

	public void list() {
		
		System.out.println();
		System.out.println("[마카롱 목록]");
		
		for(int i=0; i<list.length; i++) {
			
			Macaron m = this.list[i];
			
			System.out.printf("%d번 마카롱: %dcm(%s, %dmm) : %s\n"
					,i+1
					,m.getSize()
					,m.getColor()
					,m.getThickness()
					,check(m) ? "합격" : "불합격");
			
		}
		System.out.println();
	}

	private boolean check(Macaron m) {
		
		if(!(m.getSize() >= 8 && m.getSize() <=14)) {
			return false;
		}
		
		if(m.getColor().equals("black")) {
			return false;
		}
		if(!(m.getThickness() >= 3 && m.getThickness() <=18)) {
			return false;			
		}
		
		return true;
	}

}
