package com.bonvoyage.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bonvoyage.models.Users;
import com.bonvoyage.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public int verifyUser(String user_email, String user_password) {
		
		//boolean b = userRepository.existsById(user_email);
		/*
		 * boolean b = userRepository.existsById(user_password); System.out.println(b);
		 * return b;
		 */
		
		return userRepository.loginUser(user_email, user_password);
		
		
		
	}

	@Override
	public String saveUser(Users users) {
		if(userRepository.existsById(users.getUser_email())) {
			return "User Already Exists";
		}
		else {
			userRepository.save(users);
		return "Saved";
		}
	}

}
