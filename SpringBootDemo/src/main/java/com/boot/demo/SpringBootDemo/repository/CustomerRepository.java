package com.boot.demo.SpringBootDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootDemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {
	
	//@Query(nativeQuery = true,value = "select * from Asif_customer u where email like 'abc2%'")
	//public List<Customer> getCustomersEndsWithEmail();
	@Query(value="select u from Customer u where email like 'abc2%'")
	public List<Customer> getCustomersEndsWithEmail();
	public List<Customer> findByCity(String city);
	public List<Customer> findByCityAndEmail(String city,String email);

}
