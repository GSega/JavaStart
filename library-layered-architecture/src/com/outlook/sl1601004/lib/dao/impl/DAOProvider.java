package com.outlook.sl1601004.lib.dao.impl;

import com.outlook.sl1601004.lib.dao.LibDAO;
import com.outlook.sl1601004.lib.dao.UserDAO;

public class DAOProvider {
	private final  static DAOProvider instance = new DAOProvider();
	
	private UserDAO userDAO = new FileUserDAO();
	private LibDAO libDAO = new FileLibDAO();
	
	private DAOProvider() {}		
	
	public static DAOProvider getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public LibDAO getLibDAO() {
		return libDAO;
	}
	

}
