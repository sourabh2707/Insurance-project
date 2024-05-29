package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.model.Premium;
import com.spring.repository.PremiumRepository;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;
	
	@Override
	public Premium addPremium(Premium premium) {
		
		return premiumRepository.save(premium);
	}

}
