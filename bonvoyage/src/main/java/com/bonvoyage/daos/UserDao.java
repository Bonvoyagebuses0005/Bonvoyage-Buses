package com.bonvoyage.daos;

import com.bonvoyage.models.Users;

public interface UserDao {

	public int verifyUser(String user_email, String user_password);

	public String saveUser(Users users);

}