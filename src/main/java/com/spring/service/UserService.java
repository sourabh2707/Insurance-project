package com.spring.service;

import java.util.List;

import com.spring.model.User;

public interface UserService {

	public User saveUser(User user);
	public List<User> fetchAllUser();
}
