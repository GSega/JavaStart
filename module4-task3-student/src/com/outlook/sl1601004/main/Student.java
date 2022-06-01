package com.outlook.sl1601004.main;

public class Student {
	
	private String fio;
	private int groupNumber;
	private Integer[] marks;
	
	{
		marks = new Integer[5]; //length 5 from the task
	}
	
	public Student (String fio, int groupNumber, Integer[] marks) {
		this.setFio(fio);
		this.setGroupNumber(groupNumber);
		this.marks = marks;
			
	}
	
	public Student (String fio, int groupNumber) {
		this.setFio(fio);
		this.setGroupNumber(groupNumber);
		this.marks = RandomMarkCreator.makeItRandom(marks);
	}
	
	public void printStudent() {
		System.out.println(this.groupNumber + ", " + this.fio);
	}
	
	
	public Integer[] getMarks() {
		return marks;
	}

	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	


	
	
}
