package com.example.orderplace.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderplace.entity.Account;
import com.example.orderplace.entity.User;
import com.example.orderplace.orderDAO.orderDAO;
import com.example.orderplace.orderDAO.util;
import com.example.orderplace.repository.AccountRepository;
import com.example.orderplace.repository.OrderRepository;
import com.example.orderplace.repository.UserRepository;
import com.example.orderplace.repository.productRepository;

@Service
public class OrderService {
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private AccountRepository accrepository;
	
	@Autowired
	private OrderRepository orderrepository;
	
	
	@Autowired
	private productRepository prorepository;

	@Autowired
	private util utils;
	
	public orderDAO ordermethod(Long userId,Long productId) {
		
		
		
		
		
		
		
//		Optional<Account> acc=accrepository.findByUserId(userId);
//		System.out.println("data in ordermethod for account "+acc);
		

		return utils.methods(userId,productId) ;
	}

	

}
