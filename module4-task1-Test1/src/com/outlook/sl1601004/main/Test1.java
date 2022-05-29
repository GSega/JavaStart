package com.outlook.sl1601004.main;

public class Test1 {

	private int a;
	private int b;

	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	public void printCurrentState() {
		System.out.println("a = " + a + ", b = " + b);

	}

}
