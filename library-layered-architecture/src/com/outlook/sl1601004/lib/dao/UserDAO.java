package com.outlook.sl1601004.lib.dao;

import com.outlook.sl1601004.lib.entity.RegistrationInfo;
import com.outlook.sl1601004.lib.entity.User;

public interface UserDAO {
	User logination (String login, String pass);
	
	boolean registration(RegistrationInfo newUser);
	
	boolean editProfile();


}
