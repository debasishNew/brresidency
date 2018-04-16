package com.brresidency.service;

import java.util.List;

import com.brresidency.model.User;

public interface IUserService {
	public String getUserName();
	public int saveUser(User user);
	
	public List<User> findAllUsers() ;
}
