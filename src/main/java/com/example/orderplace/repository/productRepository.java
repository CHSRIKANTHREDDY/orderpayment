package com.example.orderplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderplace.entity.product;

@Repository
public interface productRepository extends JpaRepository<product, Long> {

	
}
