package com.codewithVikas.fullbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codewithVikas.fullbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
}
