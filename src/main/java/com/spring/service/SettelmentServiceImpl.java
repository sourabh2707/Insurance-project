package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.repository.SettelmentRepository;

@Service
public class SettelmentServiceImpl implements SettelmentService{

	@Autowired
	private SettelmentRepository settelmentRepository;
	
	@Override
	public void deleteUserSettelment(int id) {
		settelmentRepository.deleteById(id);
	}

}
