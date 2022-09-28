package com.example.orderplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderplace.orderDAO.orderDAO;
import com.example.orderplace.orderDAO.util;

@Service
public class OrderService {


	@Autowired
	private util utils;

	public orderDAO ordermethod(Long userId, Long productId) {

		return utils.methods(userId, productId);
	}

}
