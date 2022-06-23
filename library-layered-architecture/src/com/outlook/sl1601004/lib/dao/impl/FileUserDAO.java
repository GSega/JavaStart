package com.outlook.sl1601004.lib.dao.impl;

import com.outlook.sl1601004.lib.dao.UserDAO;
import com.outlook.sl1601004.lib.entity.RegistrationInfo;
import com.outlook.sl1601004.lib.entity.User;

public class FileUserDAO implements UserDAO {
	private static final FileUserDAO instance = new FileUserDAO();
	
	public static FileUserDAO getInstance() {
		
		return instance;
	}
	
	@Override
	public User logination(String login, String pass) {
		// TODO Auto-generated method stub
		/*
		 * открыть файл 
		 * искать строку где совпадают логин и пароль с переданными в метод
		 * допарсить из строчки оставшиеся данные (имя и фаилия) 
		 * вернуть объект User сделанный из данных допарсенных из строки
		 */
		return new User();
	}

	@Override
	public boolean registration(RegistrationInfo newUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editProfile() {
		// TODO Auto-generated method stub
		return false;
		
	}

}
