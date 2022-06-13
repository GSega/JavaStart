package com.outlook.sl1601004.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

	private String destinationPoint;
	private int trainNumber;
	private Date departureTime;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	public Train(String destinationPoint, int trainNumber, String departureTime) {
		this.setDestinationPoint(destinationPoint);
		this.setTrainNumber(trainNumber);
		try {
			this.setDepartureTime(sdf.parse(departureTime));
		} catch (ParseException e) {
			System.out.println("parsing date error. parse time format is: dd/MM/yyyy HH:mm");
			e.printStackTrace();
		}
	}

	public Train() {
	}

	public void printTrain() {
		String formattedDepartureTime = sdf.format(this.getDepartureTime());
		System.out.println("train number " + this.getTrainNumber() + " - dest: " + this.getDestinationPoint() + " - "
				+ formattedDepartureTime);
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [destinationPoint=" + destinationPoint + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
