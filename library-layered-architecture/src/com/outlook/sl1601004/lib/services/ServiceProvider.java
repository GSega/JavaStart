package com.outlook.sl1601004.lib.services;

import com.outlook.sl1601004.lib.services.impl.LibServiceImpl;
import com.outlook.sl1601004.lib.services.impl.UserServiceImpl;


public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private LibService libService = new LibServiceImpl();
	private UserService userService = new UserServiceImpl();
	
	public static ServiceProvider getInstance() {
		return instance;
	}

	public LibService getLibService() {
		return libService;
	}

	public UserService getUserService() {
		return userService;
	}
	
	
}
 	