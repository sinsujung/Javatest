package com.test.question.q108;

public class MySet {

	private String[] list;
	private int index;
	private int sindex;

	public MySet() { //초깃값 설정 
		this.list = new String[4];
		this.index = 0;
		this.sindex = 0;

	}

	public void add(String value) {
		
			if(this.index >= this.list.length) {
				String []temp = new String[this.list.length *2];
				
				for(int i=0; i<this.list.length; i++) {
					temp[i] = this.list[i];
				}
				this.list =temp; //인덱스가 리스트보다 커지면 새로운 배열을 만들어서 배열을 두배로 늘려주고 리스트에 다시 복사.
			}
			this.list[this.index] = value ;
			this.index++; // 리스트에 값을 넣어주고 넣은 값의 개수만큼 인덱스를 증가시킨다~
		
	}
	
	public int size() {
		
		return this.index; // 사이즈 출력 
	}
	
	public void remove(String value) {
		
		int index = -1; //지역 변수 인덱스 일단 초ㄱㅣ화  
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) { //for 문 돌면서 list[i]에 들은 값이 value와 같으면 index = i로 다시 초기화.
				index = i;
				break; //같으면 포문 탈출 
			}
		}
		
		for(int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;// 인덱스부터 한칸씩 당겨주기 
		
	}
	public boolean hasNext() {
		if(this.sindex < this.index) { //0부터 마지막 인덱스까지 넘기기 
			
			return true;
		}
		
		return false;
	}
	
	public String next() {
		String temp = this.list[this.sindex];
		
		this.sindex++;
		
		return temp;// 0번째 리스트부터 1씩 늘어나면서 템프에 담고 리턴 
	}
	
	public void clear() {
		this.index = 0; //0으로 초기화 
	}
}
