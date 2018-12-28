package com.myblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myblog.entity.User;
import com.myblog.service.UserService;

@RestController
@RequestMapping("/use")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@GetMapping("/allUsers")
	public List<User>getAllUsers(){
		return userservice.getAllUsers();
	}
	@PostMapping("/")
	public void addUser(String name, int age) {
		userservice.addUser(name,age);
	//TO DO	 stuff in git
	}
	
	
	
}
