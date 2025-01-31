package com.cse.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse.demo.model.Customer;
import com.cse.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepository repo;
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}
	
	public String saveCustomer(Customer customer) {
		repo.save(customer);
		return "Customer Added";
	}
	public Customer getCustomerById(int id) {
		Optional<Customer> customer = repo.findById(id);
		return customer.orElse(null);
	}
	public String deleteCustomerById(int id) {
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return "Customer Deleted";
		}
		else 
		{
			return "Customer Not Found";
		}
	}
	public String updateCustomerById(int id,Customer updatedCustomer) {
		Optional<Customer> customerOptional = repo.findById(id);
		if(customerOptional.isPresent()) {
			Customer existingCustomer = customerOptional.get();
			existingCustomer.setName(updatedCustomer.getName());
			existingCustomer.setUser(updatedCustomer.getUser());
			existingCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
			existingCustomer.setEmailId(updatedCustomer.getEmailId());
			existingCustomer.setDob(updatedCustomer.getDob());;
			existingCustomer.setAddress(updatedCustomer.getAddress());
			existingCustomer.setPassword(updatedCustomer.getPassword());
			//existingCustomer.setOrder(updatedCustomer.getOrder());
			repo.save(existingCustomer);
			return "Customer Updated";
		}
		else {
			return "Customer Not Found";
		}
	}

}

