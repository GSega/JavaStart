package com.outlook.sl1601004.lib.entity;

public class RegistrationInfo extends User{
	
		String login;
		String pass;

	
	public RegistrationInfo(String name, String surname, String login, String pass) {
		super(name, surname);
		this.login = login;
		this.pass = pass;
	}
	
	

}
