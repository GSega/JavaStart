package com.outlook.sl1601004.main;

public class Operations {

	public static int sumOf(Test1 test1) {
		int result;
		result = test1.getA() + test1.getB();
		return result;
	}

	public static int maxOf(Test1 test1) {
		int result;
		if (test1.getA() > test1.getB()) {
			result = test1.getA();
		} else {
			result = test1.getB();
		}
		return result;
	}

}
