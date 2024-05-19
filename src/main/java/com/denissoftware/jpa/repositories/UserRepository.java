package com.denissoftware.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}