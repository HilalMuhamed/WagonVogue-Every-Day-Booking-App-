package com.cse.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>
{
	
}