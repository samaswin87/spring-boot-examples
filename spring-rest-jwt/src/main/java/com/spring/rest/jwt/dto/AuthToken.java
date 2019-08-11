package com.spring.rest.jwt.dto;

public class AuthToken {

	private String token;
	private String username;

	public AuthToken() {
		super();
	}

	public AuthToken(String token, String username) {
		super();
		this.token = token;
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
