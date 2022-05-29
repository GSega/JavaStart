package com.outlook.sl1601004.main;

public class Main {

	public static void main(String[] args) {
		Test1 test = new Test1 (4, 6);
		
		System.out.println(Operations.sumOf(test));
		
		System.out.println(Operations.maxOf(test));
		
		test.printCurrentState();
		
	}

}
