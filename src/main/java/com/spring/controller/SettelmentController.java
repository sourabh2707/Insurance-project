package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.SettelmentServiceImpl;

@RequestMapping("/settelment")
@Controller
public class SettelmentController {

	@Autowired
	private SettelmentServiceImpl settelmentServiceImpl;

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteSettelment(@PathVariable int id) {
		settelmentServiceImpl.deleteUserSettelment(id);
		return ResponseEntity.ok().body("Successfully deleted");
	}

}
