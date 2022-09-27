package com.example.orderplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderplace.entity.Order1;


@Repository
public interface OrderRepository extends JpaRepository<Order1, Long>{

}
