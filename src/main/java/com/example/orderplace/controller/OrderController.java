package com.example.orderplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderplace.entity.User;
import com.example.orderplace.orderDAO.orderDAO;
import com.example.orderplace.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	@GetMapping("/order/{userId}/{productId}")
	public orderDAO placeorder(@PathVariable("userId") Long userId,@PathVariable("productId") Long productId) {
		
		return orderservice.ordermethod(userId,productId);
		
	}

}
