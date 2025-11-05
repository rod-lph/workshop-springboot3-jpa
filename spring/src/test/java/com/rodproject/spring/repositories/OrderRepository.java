package com.rodproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodproject.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}