package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Premium;
import com.spring.service.PremiumServiceImpl;

@RequestMapping("/premium")
@Controller
public class PremiumController {

	@Autowired
	private PremiumServiceImpl premiumServiceImpl;

	@PostMapping("/addpremium")
	public ResponseEntity<Premium> savePremium(@RequestBody Premium premium) {
		Premium premium1 = premiumServiceImpl.addPremium(premium);
		return ResponseEntity.ok().body(premium1);
	}

}
