package com.boot.demo.SpringBootDemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.service.CustomerService;

//http://localhost:8080/ShoppingProject/customers/add
//@Controller
//@RequestMapping("/customers")
public class CustomerController {

	
	@Autowired
	private CustomerService service;
	
	public CustomerController() {
		System.out.println("Customer Controller");
	}
	//@RequestMapping(method = RequestMethod.POST, path="/add")
	public String addCustomer(Customer customer)
	{
		
		System.out.println("add customer");
		this.service.save(customer);
		return "redirect:/customers";
	}
	//@RequestMapping("/{email}")
//	public String getCustomer(@PathVariable String email, Map<String, Customer> map, 
//			HttpSession session)
//	{
//		System.out.println("get customer");
//		System.out.println(session.getAttribute("email"));
//		if(session.getAttribute("email") == null) {
//			System.out.println("session null");
//			return "redirect:/";
//		}
//		Customer customer = this.service.get(email);
//		System.out.println("customer "+customer);
//		map.put("customer", customer);
//		return "customer";
//	}
	//@GetMapping
	public String getCustomers(Map<String, List<Customer>> map)
	{
		System.out.println("get customers");
		List<Customer> Customers = this.service.getAllCustomers();
		System.out.println("Customers "+Customers);
		map.put("customers", Customers);
		return "customerslist";
	}
	
}
