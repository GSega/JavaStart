package com.outlook.sl1601004.main;

import java.util.Scanner;

public class Operations {

	public static void sortByNumber(Train[] trains) {

		for (int i = 1; i < trains.length; i++) {
			Train currVal = trains[i];
			int j = i;

			while (j > 0 && currVal.getTrainNumber() < trains[j - 1].getTrainNumber()) {
				trains[j] = trains[j - 1];
				j--;
			}

			trains[j] = currVal;
		}
	}

	public static void printByNumber(Train[] trains, int inputNumber) {
		int trainNumber = inputNumber;
		
		for (Train t : trains) {
			if (t.getTrainNumber() == trainNumber) {
				t.printTrain();
				break;
			} 
		}
	}
	
	public static void sortByDestination(Train[] trains) {
		boolean oneMoreTime = true;
		
		while (oneMoreTime) {
			oneMoreTime = false;
			
			for (int i = 1; i < trains.length; i++) {
				if (trains[i].getDestinationPoint().compareTo(trains[i-1].getDestinationPoint()) < 0) {
					Train temp = trains[i];
					trains[i] = trains[i-1];
					trains[i-1] = temp;
					oneMoreTime = true;
				} else if ((trains[i].getDestinationPoint().compareTo(trains[i-1].getDestinationPoint()) == 0) && 
						(trains[i-1].getDepartureTime().after(trains[i].getDepartureTime()))) {
					Train temp = trains[i];
					trains[i] = trains[i-1];
					trains[i-1] = temp;
					oneMoreTime = true;
				}
			}
		}
		
	}

		
}
