package com.user.client.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.client.dao.UserInterfaceDAO;
import com.user.client.entity.User;

@Service
@Transactional
public class UserServiceImp implements UserserviceInteface{
	@Autowired
	UserInterfaceDAO ud;

	@Override
	public int creataccount(User u) {
		int i =0;
		ud.save(u);
		i = 1;
		return i;
	}

	@Override
	public int loginService(User u) {
		int i = 0;
		User u1 = ud.loginDAO(u.getEmail(), u.getPassword());
		if(u1 != null)
		   i =1;
		return i;
	}

}
