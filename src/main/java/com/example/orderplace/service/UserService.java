package com.example.orderplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderplace.entity.User;
import com.example.orderplace.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;

	public User savedata(User user) {
		System.out.println("user body data in service"+user);

		return userrepository.save(user);
	}

	public List<User> getdata() {
		return userrepository.findAll();
	}

	public User GetById(User userId) {
		return userrepository.findByUserId(userId);
	}

}
