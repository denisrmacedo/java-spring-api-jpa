package com.denissoftware.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}