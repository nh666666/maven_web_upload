package com.eb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eb.entity.User;
import com.eb.service.UserService;

//@Controller
public class UploadSubmitController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/uploadSubmit",method=RequestMethod.POST)
	public String uploadSubmit(User user,HttpServletRequest request) {
		String path = request+"/resources/upimg/"+user.getPicname()+".jpg";
		Map<String,String> result = userService.insertUser(user);
		return "main";
	}
	
}
