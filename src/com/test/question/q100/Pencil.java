package com.test.question.q100;

public class Pencil {

	private String hardness;
	
	public String getHardness() {
		return hardness;
	}
//4B, 3B, 2B, B, HB, H, 2H, 3H, 4H
	public void setHardness(String hardness) {	
		this.hardness = hardness;
	}
	
	public String info( ) {
			return String.format("%s 진하기 연필", this.hardness);
	}

	
}
