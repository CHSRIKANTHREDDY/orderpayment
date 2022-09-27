package com.example.orderplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderplace.entity.User;
import com.example.orderplace.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/save")
	public User Savadata(@RequestBody User user) {	
		
		System.out.println("user body data"+user);
		return userservice.savedata(user);
	}
	
	@GetMapping("/users")
	public List<User> findAll() {
		return userservice.getdata();
	}
	
	@GetMapping("/userid/{userId}")
	public User findbyid(@PathVariable("userId") User userId) {
		return userservice.GetById(userId);
	}
	

}
