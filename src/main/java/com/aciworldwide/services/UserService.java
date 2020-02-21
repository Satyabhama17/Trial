package com.aciworldwide.services;



import com.aciworldwide.entities.User;

//Business Layer interface 
			//same as component ie it is stereotype
public interface UserService {
	//business logic methods specification
	boolean isvalid(User user);
}
