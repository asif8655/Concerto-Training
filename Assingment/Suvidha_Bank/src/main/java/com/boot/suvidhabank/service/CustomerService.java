package com.boot.suvidhabank.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.suvidhabank.entity.Customer;
import com.boot.suvidhabank.repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer findCustomerByEmail(String email) {
		Optional<Customer> optc=this.customerRepo.findById(email);
		return optc.orElseThrow(()->new EntityNotFoundException("Customer not found"));
		
	}
	
	public boolean insertCustomer(Customer customer) {
		if(!this.customerRepo.existsById(customer.getEmailId())) {
			this.customerRepo.save(customer);
			return true;	
		}
		return false;
	}
	
	
	
	

}
