package com.test.question.q106;

public class MyStack {

	private String[] list;
	private int index;// ****

	public MyStack() {
		this.list = new String[4]; // list의 길이를 4로 초기화
		this.index = 0;
	}

	public boolean push(String value) {
		if (this.index >= list.length) {
			String[] newList = new String[this.list.length * 2];

			for (int i = 0; i < this.list.length; i++) {
				newList[i] = this.list[i];
			}

			this.list = newList;

		}
		this.list[this.index] = value;
		this.index++;
		return true;

	}

	public String pop() {
		
		if(this.index >0) { // 스택이 비어있지 않으면 
		String temp = this.list[this.index - 1]; //가장 위에 있는 요소를 새로운 변수에 저장
		this.list[index - 1] = null; //가장 위에 있는 요소는 비운다. 
		this.index--;//요소를 제거 했으니 인덱스 감소 

		return temp; //임시 변수에 저장한 값을 반환
		}else {
			return null; //스택이 비었으면 null리턴
		}
	}
	
	
	public int size()	{
		
		return index;
	}
	
	public String peek() {
		String temp = this.list[this.index-1]; //가장 위에 있는 요소를 새로운 변수에 저장 한 뒤 리턴
		
		return temp; 
	}
	
	public void trimToSize() {
		String[] temp = new String[this.index]; // 새로운 배열 temp 생성 

		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.list[i]; //temp 배열에 현재 배열 요소 저장 
		}

		this.list = temp; // temp 저장된 배열의 요소들 저장 
	}
	
	public void clear() {
		
		this.index=0; // index 0으로 초기화
	}
}
