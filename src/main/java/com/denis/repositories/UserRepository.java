package com.denis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denis.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}