package com.cse.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.demo.model.Reserve;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve,Integer>{

}
