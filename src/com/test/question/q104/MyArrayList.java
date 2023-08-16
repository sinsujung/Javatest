	package com.test.question.q104;

import java.util.Arrays;

public class MyArrayList {
	
	private String[] list;
	
	//1. 현재 요소를 대입할 방번호
	//2. 현재까지 대입된 요소의 개수
	
	private int index ;//****
	
	public MyArrayList()	{
		this.index = 0;
		this.list = new String[4];
	}
	
	//개발할 때 유용하게 사용되는 것 중 하나 , toString()
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("length: %d\n", this.list.length));
		sb.append(String.format("index: %d\n", this.index));
		sb.append(Arrays.toString(this.list));
		
		return sb.toString();
	}
	public boolean add(String value) {
		//배열의 방이 남아 있는지 확인하고 남아있으면 그대로 진행, 없으면 두배로 늘리기
		
		//if(this.index == null) > 이것도 가능
		if(checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = value;
		this.index++;
		
		return false;
		
		}
		private void doubleList() {
			String[]temp = new String[this.list.length * 2];
			
			//깊은 복사
			for(int i=0; i<this.list.length; i++) { //루프 > 짧은 배열 길이
				temp[i] = this.list[i];
			}
			this.list = temp; // 배열 교체
		}
		private boolean checkLength() {
			
			if(this.list.length == this.index) {
				return true;
			}
			
			return false;
		}
		
	
	public String get(int index) {
		
		if(index < 0 || index >= this.index) {
			//없는 방번호 요청 > IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}
		return this.list[index];
		
	}
	
	public int size() {
		
		return this.index;
	}
	
	public String set(int index, String value) {
	
		return this.list[index] = value;
		
	}
	
	public String remove(int index) {
		
	//요소 삭제 > 우측의 모든 요소 > 왼쪽으로 1 칸이동 > left shift
		for(int i = index; i < this.list.length-1; i++) {
			this.list[i] = this.list[i+1];	
		}
		this.index--;
		
		return this.list[index];
	}
	

	public void add(int index, String value) {
	
		//요소 삽입 > 우측의 모든 요소 > 오른쪽으로 1 칸이동 > Rigth shift
		System.out.println();
		if(checkLength()) {
			doubleList();
		}
		for(int i=this.list.length-2; i >=index; i--) {
			this.list[i+1] = this.list[i];
		}
		this.index++;
		
		this.list[index] = value;
	
	}
	
	public int indexOf(String value) {

		System.out.println();
		
		for(int i=0; i<list.length; i++) {
			
			if(this.list[i]!=value) {
				return -1;		
			}
			
		}
		return index;
	}
	
	public int lastIndexOf(String value) { 
		
		
		for(int i=this.index-1; i>=0; i--) {
			
			if(this.list[i]!=value) {
				return -1;		
			}
			
		}
		return index;
	}

	public boolean contains(String value) {
		
		for (int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public void clear(){
		
//		for(int i=0; i<this.index; i++) {
//			this.list[i] = null;
//		}
//	
//		this.index =0 ;

		
//		this.list = new String[4]; //새로운 배열 교체
//		this.index = 0;
		
		this.index = 0;// 효율이 가장 좋다~
		
	}
	
}
