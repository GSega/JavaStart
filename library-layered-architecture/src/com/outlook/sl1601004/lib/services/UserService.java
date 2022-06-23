package com.outlook.sl1601004.lib.services;

import com.outlook.sl1601004.lib.entity.RegistrationInfo;
import com.outlook.sl1601004.lib.entity.User;

public interface UserService {
	User logination (String login, String password);
	
	boolean registration (RegistrationInfo regInfo); 
	
	void restorePassword(String userName);
	
	void blockUser(int id);

}
