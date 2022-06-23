package com.outlook.sl1601004.lib.controller;

import com.outlook.sl1601004.lib.entity.RegistrationInfo;
import com.outlook.sl1601004.lib.entity.User;
import com.outlook.sl1601004.lib.services.ServiceProvider;
import com.outlook.sl1601004.lib.services.UserService;

public class Controller {

	public String doAction(String command) {
		/// logination user=user1 password=pass1
		/// registration name=name5 surname=surname5 user=user5 password=pass5
		/// 
		String message = null;
		String[] params = command.split("\\s+");

		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService;

		switch (params[0]) {
		case "logination":
			UserService userServiceLogin = provider.getUserService();
			User user = userServiceLogin.logination(params[1].split("=")[1], params[2].split("=")[2]);

			if (user != null) {
				message = "Sucsessfull login! Hello " + user.getName();
			} else {
				message = "sorry, try again";
			}
			break;

		case "registration":

			UserService userServiceReg = provider.getUserService();
			boolean newUser = userServiceReg.registration(new RegistrationInfo(params[1].split("=")[1],
					params[2].split("=")[1], params[3].split("=")[1], params[4].split("=")[1]));
			
			if (newUser) {
				message = "Registraton sucsessfull";
			} else {
				message = "sorry, try again";
			}
			break;

		case "add_new_book":
			break; 

		}

		return message;

	}

}
