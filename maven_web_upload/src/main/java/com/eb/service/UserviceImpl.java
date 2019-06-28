package com.eb.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.entity.User;
import com.eb.mapper.UserMapper;

//@Service
public class UserviceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Map<String, String> insertUser(User user) {
		return null;
	}

}
