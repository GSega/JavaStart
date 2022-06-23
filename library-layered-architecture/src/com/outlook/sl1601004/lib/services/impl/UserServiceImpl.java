package com.outlook.sl1601004.lib.services.impl;

import com.outlook.sl1601004.lib.dao.UserDAO;
import com.outlook.sl1601004.lib.dao.impl.DAOProvider;
import com.outlook.sl1601004.lib.dao.impl.FileUserDAO;
import com.outlook.sl1601004.lib.entity.RegistrationInfo;
import com.outlook.sl1601004.lib.entity.User;
import com.outlook.sl1601004.lib.services.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User logination(String login, String password) {
		//validation - login, password not null, ....not less 5 symbols...... contains Upper case, contains lower case etc......
		 if (login == null | password == null) {
			 throw new RuntimeException("input error");
		 }
		 DAOProvider provider = DAOProvider.getInstance();
		 UserDAO userDAO = provider.getUserDAO();
		 
		 User user;
		 
		 user = userDAO.logination(login, password);
		 
		return user;
	}

	@Override
	public boolean registration(RegistrationInfo regInfo) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public void restorePassword(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blockUser(int id) {
		// TODO Auto-generated method stub
		
	}

}
