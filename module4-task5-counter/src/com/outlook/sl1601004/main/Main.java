package com.outlook.sl1601004.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("create counter with basic constructor:");
		DecimalCounter decimalCounter = new DecimalCounter();
		
		System.out.println(decimalCounter.toString());
		
		System.out.println("try to create counter with current out of bounds:");
		decimalCounter = new DecimalCounter(11, 9);
		
		System.out.println("create counter with current equals max:");
		decimalCounter = new DecimalCounter(11, 20);
		System.out.println(decimalCounter.toString());
		
		System.out.println("increment counter while current value is already max:");
		decimalCounter.incrementCounter();
		System.out.println(decimalCounter.toString());
		
		System.out.println("decrement counter while current value is already min:");
		decimalCounter.decrementCounter();
		System.out.println(decimalCounter.toString());

		


		
		

	}

}
