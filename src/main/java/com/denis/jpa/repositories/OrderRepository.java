package com.denis.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denis.jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}