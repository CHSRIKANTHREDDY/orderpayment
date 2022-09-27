package com.example.orderplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderplace.entity.Account;
import com.example.orderplace.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountservice;
	
	
	@PostMapping("/savedata")
	public Account Savadata(@RequestBody Account account) {	
		return accountservice.savedata(account);
	}
	
	@GetMapping("/accounts")
	public List<Account> findAll() {
		return accountservice.getdata();
	}
	
	@GetMapping("/accountId/{accountId}")
	public Account findbyid(@PathVariable("accountId") Long accountId) {
		return accountservice.GetById(accountId);
	}

}
