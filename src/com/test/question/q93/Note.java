package com.test.question.q93;

class Note {

	private String size;
	private String color;
	private int page ;
	private String owner;
	private int price = 500;

	// setter, getter 구현

	public void setSize(String size) {

		if (size.equals("A3") 
				|| size.equals("A4") 
				|| size.equals("A5") 
				|| size.equals("B3") 
				|| size.equals("B4")
				|| size.equals("B5")) {
				this.size = size;
		} else {
			System.out.println("잘못된 사이즈를 입력했습니다.");
		}

		if(this.size.equals("A3")) {
			this.price += 400;
		} else if (this.size.equals("A4")) {
			this.price += 200;
		} else if (this.size.equals("B3")) {
			this.price += 500;
		} else if (this.size.equals("B4")) {
			this.price += 300;
		} else if (this.size.equals("B5")) {
			this.price += 100;
		}
	}

	public void setColor(String color) {

		if (color.equals("검정색") 
				|| color.equals("흰색") 
				|| color.equals("노란색") 
				|| color.equals("파란색")) {
			this.color = color;
		} else {
			System.out.println("잘못된 색상을 입력했습니다.");
		}
		if(this.color.equals("검정색")) {
			this.price += 100;
		} else if(this.color.equals("노란색")) {
			this.price += 200;
		} else if(this.color.equals("파랑색")) {
			this.price += 200;
		}
	}

	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		} else {
			System.out.println("잘못된 페이지 수를 입력했습니다.");
		}
	}

	public void setOwner(String owner) {
		if (owner.length() < 2 || owner.length() > 5) {
			System.out.println("잘못된 소유자 이름입니다.");
			return;
		}
		for (int i = 0; i < owner.length(); i++) {
			char c = owner.charAt(i);
			if (c < '가' || c > '힣') {
				System.out.println("잘못된 소유자 이름입니다.");
				return;
			}
		}
		this.owner = owner;
		
		this.price += (this.page - 10) * 10;
	}

public String info() {
	
	//문자열(null)
	//if (owner != null) > 연산자 사용 > 주소값 비교
	
	//문자열("")
	//if(owner.equals("")) > 메소드 사용 > 값 비교
	
	String tempPage = "";
	
	if (this.page >= 10 && this.page <= 50) {
		tempPage = "얇은";
	} else if (this.page > 50 && this.page <= 100) {
		tempPage = "보통의";
	} else if (this.page > 100 && this.page <= 200) {
		tempPage = "두꺼운";
	}
	
	String temp = "";
	temp += "■ ■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■ ■\n";
	
	if(owner != null) {
		temp += String.format("소유자: %s\n", this.owner);
		temp += String.format("특성: %s %s %s노트\n", this.color, tempPage, this.size);
		temp += String.format("가격: %,d원\n", this.price);
	} else {
		temp += "주인 없는 노트\n";
	}
	
	temp += "■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ \n";
	
	return temp;
		
	}
}