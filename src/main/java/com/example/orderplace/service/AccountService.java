package com.example.orderplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderplace.entity.Account;
import com.example.orderplace.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository acountrepository;

	public Account savedata(Account account) {
		return acountrepository.save(account);
	}

	public List<Account> getdata() {
		return acountrepository.findAll();
	}

	public Account GetById(Long accountId) {
		return acountrepository.findById(accountId).get();
	}

}
