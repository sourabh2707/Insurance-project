package com.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		
		return ResponseEntity.ok().body(null);
	}
}
