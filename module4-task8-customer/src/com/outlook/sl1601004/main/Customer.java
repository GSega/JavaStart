package com.outlook.sl1601004.main;
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

public class Customer {
	private int id;
	private String secondName;
	private String firstName;
	private String fathersName;
	private String address;
	private String creditCardNumber;
	private String bankAccNumber;

	public Customer() {
		this.setId(0);
		this.setFirstName("default");
		this.setSecondName("default");
		this.setFathersName("default");
		this.setAddress("default");
		this.setBankAccNumber("default");
		this.setCreditCardNumber("default");
	}

	public Customer(int id, String firstName, String secondName, String fathersName, String address,
			String creditCardNumber, String bankAccNumber) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setSecondName(secondName);
		this.setFathersName(fathersName);
		this.setAddress(address);
		this.setCreditCardNumber(creditCardNumber);
		this.setBankAccNumber(bankAccNumber);
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", secondName=" + secondName + ", firstName=" + firstName + ", fathersName="
				+ fathersName + ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccNumber="
				+ bankAccNumber + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(String bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
}
