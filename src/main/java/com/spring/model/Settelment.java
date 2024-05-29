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

	public Settelment() {
		super();
	}

	public Settelment(int settelmentId, String details, User user) {
		super();
		this.settelmentId = settelmentId;
		this.details = details;
		this.user = user;
	}

	public int getSettelmentId() {
		return settelmentId;
	}

	public void setSettelmentId(int settelmentId) {
		this.settelmentId = settelmentId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
