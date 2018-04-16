package com.brresidency.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brresidency.model.User;
import com.brresidency.persister.IUserPersister;


@Service
public class UserService implements IUserService {

	private static final Logger log = Logger.getLogger(UserService.class);

	@Autowired
	IUserPersister userPersister;
	
	public String getUserName() {
		log.info("entering into getUserName()");
		log.info("exiting into getUserName()");
		return userPersister.getUserName();
	}
	
	public int saveUser(User user){
		return userPersister.saveUser(user);
	}
	
	public List<User> findAllUsers() {
		return userPersister.findAllUsers();
	}
}
