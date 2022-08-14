package com.sripal.service;

import org.springframework.stereotype.Service;

import com.sripal.entity.User;

@Service
public interface UserService {
	
	public void saveUser(User user);

}
