package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//presentation layer-request processing component of spring web mvc
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;
@Controller //same as component ie it is stereotype
public class LoginController { //pojo class that doesnt extend any class
	//used to invoke business layer
	@Autowired
	private UserService userService;
	
	//request processing method
	@RequestMapping("/signin")		//handler mapping..if request comes ,signin will respond..
	public String validateUser(User user,ModelMap map) {
		//invoking business logic method of business layer(service layer)
		if(userService.isvalid(user)) {
			map.addAttribute("uname", user.getUser()); //gets value from success page
			return "success"; //success.jsp is the logical view name..uname is a key
		}
		else {
			map.addAttribute("logonerror", "invalid username/passoword"); //can be displayed in error.html or error.jsp page
			return "login";
		}
	}
}
