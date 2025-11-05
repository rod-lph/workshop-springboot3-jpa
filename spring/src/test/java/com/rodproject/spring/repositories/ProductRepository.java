package com.rodproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodproject.spring.entities.Category;
import com.rodproject.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}