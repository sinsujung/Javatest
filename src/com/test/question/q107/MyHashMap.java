package com.test.question.q107;

public class MyHashMap {

	private String[] key;
	private String[] value;
	private int index;
	
	public MyHashMap() {
		this.key = new String[4];
		this.value = new String[4];
		this.index = 0;
		
	}
	public void put(String key, String value) {
		if(getIndex(key) == -1) {
		if(checkLength()) {
			doubleList();
		}
		
		this.key[index] = key;
		this.value[index] = value;
		this.index++;

		}else {
			this.value[getIndex(key)] = value;
		}
	}
	
	private boolean checkLength() {
		if(this.index == this.key.length) {
			return true;
		}
		return false;
	}
	
	private void doubleList() {
		String[]temp = new String[this.key.length * 2];
		
		for(int i=0; i<key.length; i++) {
			temp[i] = this.key[i];
		}
		this.key = temp;
		
		String[] temp2 = new String[this.value.length *2];
		
		for(int i=0; i<value.length; i++) {
			temp2[i] =this.value[i];
		}
		this.value = temp2;
		
	}
	
	private int getIndex(String key) {
		
		for(int i=0; i<this.index; i++) {
			if(this.key[i].equals(key)) {
				return i;
			}
		}
		
		return -1;
	}
	public String get(String key) {
	
		int index = getIndex(key);
		
		if(index != -1) {
			return this.value[getIndex(key)];
		}else {
			return null;
		}
		
	}
	
	public int size() {
		return this.index;
	}
	
	public void remove(String key) {
		
		int index = getIndex(key);
		if(index > -1) {
			
			for(int i=index; i<this.key.length-2; i++) {
				this.key[i] = this.key[i+1];
			}
			for(int i=index; i<this.value.length-2; i++) {
				this.value[i] = this.value[i+1];
			}
			index--;
		}
	}
	public boolean containsKey(String key) {
		
		if(getIndex(key)>-1) {
			return true;
		}
		
		return false;
	}
	
	public boolean containsValue(String value) {
		
		for(int i=0; i<this.index; i++) {
			if(this.value[i].equals(value)) {
				return true;
			}
			
		}
		return false;
	}
	
	public void clear() {
		
		this.index =0;
	}
}
