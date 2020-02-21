package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
@Service    //Business Layer interface implementor class
public class UserServiceImpl implements UserService {

	@Override
	public boolean isvalid(User user) {
		// TODO Auto-generated method stub
		
		//business logic
		if(user!=null && user.getUser().equals("satyabhama") && user.getPassword().equals("welcome"))
		{
			return true;
		}
		return false;
	}

}
