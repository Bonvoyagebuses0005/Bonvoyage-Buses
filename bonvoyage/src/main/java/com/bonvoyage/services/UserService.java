package com.bonvoyage.services;

import com.bonvoyage.models.Users;

public interface UserService {
	
	public String verifyUser(String user_email, String user_password);

	public String saveUser(Users users);

}