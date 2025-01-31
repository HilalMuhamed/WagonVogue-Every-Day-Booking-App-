package com.cse.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.demo.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Integer>{
	
}