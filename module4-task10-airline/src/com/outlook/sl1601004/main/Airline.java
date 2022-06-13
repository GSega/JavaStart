package com.outlook.sl1601004.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
	private String destination;
	private int flightNumber;
	private String planeType;
	private Date departureTime;
	private String dayOfWeek;
	public static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public Airline() {
		this.setDestination("def");
		this.setFlightNumber(0);
		this.setPlaneType("def");
		this.setDepartureTime(null);
		this.setDayOfWeek("def");
	}

	public Airline(String destination, int flightNumber, String planeType, String departureTime, String DayOfWeek) {
		this.setDestination(destination);
		this.setFlightNumber(flightNumber);
		this.setPlaneType(planeType);
		this.setDepartureTime(departureTime);
		this.setDayOfWeek(DayOfWeek);
	}
	
	

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", planeType=" + planeType
				+ ", departureTime=" + departureTime + ", dayOfWeek=" + dayOfWeek + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {

		try {
			this.departureTime = sdf.parse(departureTime);
		} catch (ParseException e) {
			System.err.println("parse from string as [HH:mm:ss] ");
			e.printStackTrace();
		}
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
