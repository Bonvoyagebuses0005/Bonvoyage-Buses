package com.bonvoyage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonvoyage.daos.UserDao;
import com.bonvoyage.models.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public String verifyUser(String user_email, String user_password) {
		int b = userDao.verifyUser(user_email, user_password);
		
		if(b==1) {
			return "Welcome!!!!";
		}else {
			return "Invalid Email_id or Password";
		}
		
	}

	@Override
	public String saveUser(Users users) {
		
		return userDao.saveUser(users);
	}

	
	
	

}
