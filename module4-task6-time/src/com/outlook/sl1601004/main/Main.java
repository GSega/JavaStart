package com.outlook.sl1601004.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		
		System.out.println(time.toString());

		time.changeHour(5);
		time.changeMinute(54);
		time.changeSecond(79);
		
		System.out.println(time.toString());
	}

}
