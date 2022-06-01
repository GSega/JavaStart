package com.outlook.sl1601004.main;

public class Test2 {
	
	private int x;
	private String str;
	
	public Test2 (int x, String str) {
		this.setStr(str);
		this.setX(x);
	}
	
	public Test2() {
		this.setStr("default");
		this.setX(1);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

}
