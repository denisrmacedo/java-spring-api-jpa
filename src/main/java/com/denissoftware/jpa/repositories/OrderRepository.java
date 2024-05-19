package com.denissoftware.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}