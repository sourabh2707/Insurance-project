package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.User;

public interface UserService {

	public User saveUser(User user);
	public List<User> fetchAllUser();
	public Optional<User> fetchById(int id);
}
