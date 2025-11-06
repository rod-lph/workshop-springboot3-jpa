package com.rodproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodproject.spring.entities.OrderItem;
import com.rodproject.spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}