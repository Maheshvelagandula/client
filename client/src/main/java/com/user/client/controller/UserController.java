package com.user.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.client.entity.User;
import com.user.client.service.UserserviceInteface;

@RestController
public class UserController {
	
	@Autowired
	UserserviceInteface us;
	
	@PostMapping("SingUp")
	public String creatAccount(@RequestBody User u) {
		int i = us.creataccount(u);
		if(i >0) {
			return "account created succsefully";
		}
		else {
			return "failed to create account";
		}
	}
	
	@GetMapping("loginUser/{email}/{password}")
	public String login(@PathVariable("email") String em,@PathVariable("password") String pwd) {
		User u=new User();
		u.setEmail(em);
		u.setPassword(pwd);
		
		int i=us.loginService(u);
		if(i>0) {
			return "login successfully";
		}
		else {
			return "login fail";
		}
	}
	
	

}
