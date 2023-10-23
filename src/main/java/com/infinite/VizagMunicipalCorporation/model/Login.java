package com.infinite.VizagMunicipalCorporation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class Login {
	@Column(name = "userName")
	private String userName;

	@Column(name = "password")
	private String password;

	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public Login() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
