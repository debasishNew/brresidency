package com.brresidency.persister;

import java.util.List;

import com.brresidency.model.User;

public interface IUserPersister {

	public String getUserName();
	
	public int saveUser(User user);
	
	public List<User> findAllUsers() ;
}
