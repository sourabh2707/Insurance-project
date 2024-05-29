package com.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	private String username;

	private int password;

	@OneToMany
	private List<Premium> premium;

	@OneToMany
	private List<Settelment> settelment;

	public User() {
		super();
	}

	public User(int userId, String username, int password, List<Premium> premium, List<Settelment> settelment) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.premium = premium;
		this.settelment = settelment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public List<Premium> getPremium() {
		return premium;
	}

	public void setPremium(List<Premium> premium) {
		this.premium = premium;
	}

	public List<Settelment> getSettelment() {
		return settelment;
	}

	public void setSettelment(List<Settelment> settelment) {
		this.settelment = settelment;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", premium=" + premium
				+ ", settelment=" + settelment + "]";
	}

}
