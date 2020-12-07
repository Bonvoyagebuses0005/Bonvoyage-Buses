package com.bonvoyage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonvoyage.models.Users;
import com.bonvoyage.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService loginService;
	
	@GetMapping("/verifyuser/{email}/{password}")
	public String verifyUser(@PathVariable("email") String user_email, @PathVariable("password") String user_password) {
		
		
		
		return loginService.verifyUser(user_email,user_password);
		
	}
	
	@RequestMapping(path = "/save",consumes="application/json")
	public String save(@RequestBody Users users) {
		
		
		
		return loginService.saveUser(users);
		
	}

}
