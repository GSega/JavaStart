package com.outlook.sl1601004.main;

import java.text.ParseException;

public class OperationsAirline {

	public static void flightsToDestination(Airline[] arrayOfFlights, String destination) {
		for (Airline a : arrayOfFlights) {
			if (a.getDestination().equals(destination)) {
				System.out.println(a.toString());
			}
		}
	}

	public static void flightsOfDay(Airline[] arrayOfFlights, String day) {
		for (Airline a : arrayOfFlights) {
			if (a.getDayOfWeek().equals(day)) {
				System.out.println(a.toString());
			}
		}
	}
	
	public static void flightsOfDayAfterTime (Airline[] arrayOfFlights, String day, String time) throws ParseException {
		for (Airline a : arrayOfFlights) {
			if (a.getDayOfWeek().equals(day) && a.getDepartureTime().after(Airline.sdf.parse(time))) {
				System.out.println(a.toString());
			}
		}
	}

}
