package com.test.question.q105;

import java.util.Arrays;

public class MyQueue {

	private String[] list;
	private int index ;//****
	
	public MyQueue() {
		this.list = new String[4]; //list의 길이를 4로 초기화
		this.index = 0;
	}

//	@Override
//	public String toString() {
//		String temp ="";
//		temp += "length:" +this.list.length + "\r\n";
//		temp += "indx:" + this.index + "\r\n";
//		temp += "[\r\n";
//		for(int i=0; i<this.list.length; i++) {
//			temp +=" " + i + ":" + this.list[i] +"\r\n";
//		}
//		temp +="]";
//		
//		return temp;
//				
//	}
	
	public boolean add(String value) {
		
		if (this.index >= this.list.length) {
			String[]newlist = new String[this.list.length *2];//인덱스 번호가 배열길이보다 커지면 새 배열을 만들어서 기존 배열 두배로 확장
	      
	        for(int i=0; i<this.list.length; i++) {
	    	   newlist[i]=this.list[i]; //요소가 안에 들어있을 경우를 대비해서 복사
	       }
	       
	       this.list = newlist;//배열 크기 복사 > 2배
	       
		}
		
			this.list[this.index] =value;
	       this.index++;
	        return true;       
	        
	}	
	public String poll () {
		if(this.index == -1) {
			throw new IndexOutOfBoundsException();
		}
		String temp = this.list[0];
		
		for(int i=0; i<=this.list.length-2; i++) {
			
			this.list[i] = this.list[i+1];//읽었으니 앞으로 값을 당겨준다~
		}
		this.index--;//인덱스 번호를 줄여준다~
		return temp;
	}

	public int size() {
		
		return index;
	}
	
	public String peek() {
		
		if(this.index == -1) {
			throw new IndexOutOfBoundsException();
		}
		return this.list[0];//제일 앞에 있는 주황 확인
	}
	
	public void trimToSize() {
		String []temp = new String [this.index];
		
		for(int i=0; i<temp.length; i++) {
			temp[i]=this.list[i];
		}
		
		this.list =temp;
	}
	
	public void clear() {
		this.index = 0;
	}
	
	
	
	
}//class
