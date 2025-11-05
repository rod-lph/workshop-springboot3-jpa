package com.rodproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodproject.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}