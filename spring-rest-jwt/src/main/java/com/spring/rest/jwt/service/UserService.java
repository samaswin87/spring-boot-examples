package com.spring.rest.jwt.service;

import java.util.List;

import com.spring.rest.jwt.model.User;

public interface UserService {

	public User save(User user);
	public List<User> findAll();
	public void delete(int id);

	public User findOne(String username);

	public User findById(int id);

	public User update(User user);
}
