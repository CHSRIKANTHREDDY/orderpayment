package com.example.orderplace.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderplace.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(User userId);
	

	

}
