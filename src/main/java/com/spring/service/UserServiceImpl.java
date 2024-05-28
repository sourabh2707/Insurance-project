package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.User;
import com.spring.repository.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public Optional<User> fetchById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	
}
