package com.test.question.q92;



class Book {
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String info() {
		String temp = "";
		temp += "제목: " + this.title+ "\n";
		temp +=String.format("가격: %,d원\n", this.price);
		temp += "저자: " + this.author + "\n";
		temp += "출판사: " + this.publisher + "\n";
		temp += "발행년도: " + this.pubYear + "년\n";
		temp += "ISBN: " + this.isbn + "\n";
		temp += String.format("page: %,d장\n", page);
		
		return temp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title.length() > 50) {
			return;
		}
		for(int i =0; i<title.length(); i++) {
			char c = title.charAt(i);
			if((c < '가' || c > '힣') 
					&& (c <'A' || c >'Z')
					&& (c < 'a' || c > 'z') 
					&& (c < '0' || c > '9') 
					&& c!=' ' ) {
				return;
			}
		}
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >=0 && price <= 1000000) {
			this.price = price;
		} else {
		System.out.println("올바른 책 가격이 아닙니다.");
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(this.page < 1) {
			return;
		}
		this.page = page;
	
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubYear() {
		return pubYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}