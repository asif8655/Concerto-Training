package com.boot.demo.SpringBootDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootDemo.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
	
	public List<Order> findByCustomerEmail(String email);
	
	@Modifying
	@Query("update Order u set u.total = :total where u.orderid=:id")
	public void updateTotal(double total, int id);

}
