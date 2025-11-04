package com.rodproject.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodproject.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
