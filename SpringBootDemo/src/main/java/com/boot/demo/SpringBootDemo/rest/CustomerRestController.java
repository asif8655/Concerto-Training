package com.boot.demo.SpringBootDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.Order;
import com.boot.demo.SpringBootDemo.service.OrderService;

@RestController
@RequestMapping("/invoice")
public class CustomerRestController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/{email}")
	public List<Order> invoice(@PathVariable String email) {
	return this.orderService.getOrders(email);	
	}

}
