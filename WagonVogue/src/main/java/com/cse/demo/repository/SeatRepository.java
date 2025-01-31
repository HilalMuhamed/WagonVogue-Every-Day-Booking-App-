package com.cse.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.demo.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer>{
	
}