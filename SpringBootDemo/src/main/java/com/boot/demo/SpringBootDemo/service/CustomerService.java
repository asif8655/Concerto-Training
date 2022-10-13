package com.boot.demo.SpringBootDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		ArrayList<Customer> list = new ArrayList<>();
		this.customerRepository.findAll().forEach(list::add);

		return list;
	}

	public boolean save(Customer customer) {

		if(this.customerRepository.existsById(customer.getEmail()))
		{
				throw new EntityExistsException("Customer with "+customer.getEmail()+" already exists");
		}
		this.customerRepository.save(customer);
		return true;
		
	}
	public boolean update(Customer customer) {

		if(! this.customerRepository.existsById(customer.getEmail()))
		{
			throw new EntityNotFoundException("Customer with "+customer.getEmail()+" cannot be updated as it does not exists exists");		
		}
		this.customerRepository.save(customer);
		return true;
	}

	public boolean delete(String id) {
		if(! this.customerRepository.existsById(id))
		{
			throw new EntityNotFoundException("Customer with "+id+" cannot be deleted as it NOTs exists");		
		}
		this.customerRepository.deleteById(id);
		
		return true;
	}

	public Customer get(String id) {
		Optional<Customer> optCust = this.customerRepository.findById(id);
		return optCust.orElseThrow(()->new EntityNotFoundException("Customer with "+id+" not found"));
	}
	
	
	public List<Customer> getAllCustomerByCity(String city){
		ArrayList<Customer> list = new ArrayList<>();
		this.customerRepository.findByCity(city).forEach(list::add);
		return list;
	}
	public List<Customer> getCustomersStartsWithEmail(){
		ArrayList<Customer> list = new ArrayList<>();
		this.customerRepository.getCustomersEndsWithEmail().forEach(list::add);
		return list;
	}
}
