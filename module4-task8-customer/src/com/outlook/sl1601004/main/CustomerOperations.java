package com.outlook.sl1601004.main;

public class CustomerOperations {

	public static void printCustomersAlphabetic(Customer[] inputCustomersArray) {

		boolean oneMoreTime = true;

		while (oneMoreTime) {
			oneMoreTime = false;
			Customer temp = null;

			for (int i = 1; i < inputCustomersArray.length; i++) {
				if (inputCustomersArray[i].getSecondName().compareTo(inputCustomersArray[i - 1].getSecondName()) < 0) {
					temp = inputCustomersArray[i];
					inputCustomersArray[i] = inputCustomersArray[i - 1];
					inputCustomersArray[i - 1] = temp;
					oneMoreTime = true;
				} else if (inputCustomersArray[i].getSecondName()
						.compareTo(inputCustomersArray[i - 1].getSecondName()) == 0
						&& inputCustomersArray[i].getFirstName()
								.compareTo(inputCustomersArray[i - 1].getFirstName()) < 0) {
					temp = inputCustomersArray[i];
					inputCustomersArray[i] = inputCustomersArray[i - 1];
					inputCustomersArray[i - 1] = temp;
					oneMoreTime = true;
				} else if (inputCustomersArray[i].getSecondName()
						.compareTo(inputCustomersArray[i - 1].getSecondName()) == 0
						&& inputCustomersArray[i].getFirstName()
								.compareTo(inputCustomersArray[i - 1].getFirstName()) == 0
						&& inputCustomersArray[i].getFathersName()
								.compareTo(inputCustomersArray[i - 1].getFathersName()) < 0) {
					temp = inputCustomersArray[i];
					inputCustomersArray[i] = inputCustomersArray[i - 1];
					inputCustomersArray[i - 1] = temp;
					oneMoreTime = true;
				}
			}
		}
		for (Customer c : inputCustomersArray) {
			System.out.println(c.toString());
		}
	}

	public static void printCutomersCreditCardInBounds(Customer[] inputCustomerArray, String from, String to) {

		for (Customer c : inputCustomerArray) {
			if (c.getCreditCardNumber().compareTo(to) < 0 && c.getCreditCardNumber().compareTo(from) > 0) {
				System.out.println(c.toString());
			}
		}

	}

}
