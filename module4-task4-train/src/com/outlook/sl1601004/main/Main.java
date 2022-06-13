package com.outlook.sl1601004.main;

public class Main {

	public static void main(String[] args) {
		Train[] trains = new Train[5];
		trains[0] = new Train("StP", 0, "1991/05/05 12:30");
		trains[1] = new Train("StP", 246, "1991/05/05 12:31");
		trains[2] = new Train("Moscow", 999, "1991/05/05 12:11");
		trains[3] = new Train("StP", 689, "1991/05/05 10:20");
		trains[4] = new Train("StP", 4, "1991/05/05 08:05");

		Operations.sortByNumber(trains);

		/*
		 * for (Train t : trains) { t.printTrain(); }
		 */
		
		/*
		 * Operations.printByNumber(trains, 4);
		 */		
		
		/*
		 * Operations.sortByDestination(trains); for (Train t : trains) {
		 * t.printTrain(); }
		 */
		

	}

}
