package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.User;
import com.spring.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User user1 = userServiceImpl.saveUser(user);
		return ResponseEntity.ok().body(user1);
	}

	@GetMapping("/getalluser")
	public ResponseEntity<List<User>> addUser() {
		List<User> userList = userServiceImpl.fetchAllUser();
		return ResponseEntity.ok().body(userList);
	}

	@GetMapping("/getuser/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable int id) {
		Optional<User> user = userServiceImpl.fetchById(id);
		return ResponseEntity.ok().body(user);
	}
}
