package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Settelment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "settelment_id")
	private int settelmentId;
	
	private String details;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
}
