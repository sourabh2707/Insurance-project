package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "premium_id")
	private int premiumId;
	
	private String type;
	
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Premium() {
		super();
	}

	public Premium(int premiumId, String type, double amount, User user) {
		super();
		this.premiumId = premiumId;
		this.type = type;
		this.amount = amount;
		this.user = user;
	}

	public int getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Premium [premiumId=" + premiumId + ", type=" + type + ", amount=" + amount + ", user=" + user + "]";
	}
	
}
