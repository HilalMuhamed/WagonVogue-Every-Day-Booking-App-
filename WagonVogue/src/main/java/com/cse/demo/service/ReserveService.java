package com.cse.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse.demo.model.Reserve;
import com.cse.demo.repository.ReserveRepository;


@Service
public class ReserveService {
	@Autowired
	public ReserveRepository repo;
	public List<Reserve> getAllReserve(){
		return repo.findAll();
	}
	
	public String saveReserve(Reserve reserve) {
		repo.save(reserve);
		return "Reserve Added";
	}
	public Reserve getReserveById(int id) {
		Optional<Reserve> reserve = repo.findById(id);
		return reserve.orElse(null);
	}
	public String deleteReserveById(int id) {
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return "Reserve Deleted";
		}
		else 
		{
			return "Reserve Not Found";
		}
	}
	public String updateReserveById(int id,Reserve updatedReserve) {
		Optional<Reserve> reserveOptional = repo.findById(id);
		if(reserveOptional.isPresent()) {
			Reserve existingReserve = reserveOptional.get();
			existingReserve.setTime1(updatedReserve.getTime1());
			existingReserve.setTime2(updatedReserve.getTime2());
			existingReserve.setDate(updatedReserve.getDate());
			existingReserve.setSeats(updatedReserve.getSeats());
			existingReserve.setPrice(updatedReserve.getPrice());;
			repo.save(existingReserve);
			return "Reserve Updated";
		}
		else {
			return "Reserve Not Updated";
		}
	}
}


