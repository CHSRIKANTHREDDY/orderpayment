package com.example.orderplace.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderplace.entity.Account;
import com.example.orderplace.entity.User;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

//	 public Account findByAccountId(Long acountId);

//	public Optional<Account> findByUserId(Long userId);

}
