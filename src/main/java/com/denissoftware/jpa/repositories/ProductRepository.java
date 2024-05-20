package com.denissoftware.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}