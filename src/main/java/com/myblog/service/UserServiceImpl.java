package com.myblog.service;

import java.util.List;

import com.myblog.dao.UserDao;
import com.myblog.entity.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;


	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public List<User> getUsersByName(String name) {
		if (name == null) {
			throw new RuntimeException("name can't be null");
		}
		return userDao.getUsersByName(name);
	}

	public void addUser(String name, int age) {
		userDao.addUser(name,age);
		
	}
	
	

}
