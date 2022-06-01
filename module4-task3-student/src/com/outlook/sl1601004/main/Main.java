package com.outlook.sl1601004.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] journal = new Student[10];
		
		journal[0] = new Student("Ivanov I I", 1);
		journal[1] = new Student("Petrov S G", 1);
		journal[2] = new Student("Sidorov S S", 1);
		journal[3] = new Student("Simpson G U", 1);
		journal[4] = new Student("Papazoglo G G", 1);
		journal[5] = new Student("Pushkin A S", 2);
		journal[6] = new Student("Unknown Player", 2);
		journal[7] = new Student("Default Name", 2);
		journal[8] = new Student("Null I I", 2);
		journal[9] = new Student("Nakonecta K N", 2);
		
		SortOperations.printGoodStudents(journal);

	}

}
