package com.outlook.sl1601004.main;

import java.util.Arrays;
import java.util.List;

public class SortOperations {

	public static void printGoodStudents(Student[] studentList) {
		System.out.println("Good students are: ");
		for (Student student : studentList) {
			Integer[] marks = student.getMarks();
			List<Integer> marksArray = Arrays.asList(marks);
			if (marksArray.contains(9) | marksArray.contains(10)) {
				student.printStudent();
			}
		}
	}

}
