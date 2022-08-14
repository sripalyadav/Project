package com.sripal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sripal.Repository.UserRepository;
import com.sripal.entity.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository urepo;

	@Override
	public void saveUser(User user) {
		
		urepo.save(user);
		
	}

}
