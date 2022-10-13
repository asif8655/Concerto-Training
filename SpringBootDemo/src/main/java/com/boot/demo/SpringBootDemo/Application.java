package com.boot.demo.SpringBootDemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.LineItem;
import com.boot.demo.SpringBootDemo.entity.Order;
import com.boot.demo.SpringBootDemo.entity.Product;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;
import com.boot.demo.SpringBootDemo.repository.LineItemRepository;
import com.boot.demo.SpringBootDemo.repository.OrderRepository;
import com.boot.demo.SpringBootDemo.repository.ProductRepository;
import com.boot.demo.SpringBootDemo.service.CustomerService;
import com.boot.demo.SpringBootDemo.service.OrderService;

@SpringBootApplication
public class Application {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private LineItemRepository lineItemRepository;
	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		
		CustomerService cs = context.getBean(CustomerService.class);
		for(Customer c:cs.getAllCustomerByCity("Mumbai"))
		System.out.println(c);
		OrderService os = context.getBean(OrderService.class);
		System.out.println(os.getOrders("abc@test.com"));
		
		System.out.println(cs.getCustomersStartsWithEmail());
		
		
	}
	
	//@Bean
	public void setUp()
	{
		orderService.insertOrder(null, null);
		
//		System.out.println("Creating data....");
//		Customer customer1 = new Customer("abc@test.com", "abc", "abc123", "Mumbai", "4545454545");
//		Customer customer2 = new Customer("abc1@test.com", "abc1", "abc1123", "Pune", "4545454545");
//		Customer customer3 = new Customer("abc2@test.com", "abc2", "abc1223", "Mumbai", "4545454545");
//		
//		customerRepository.save(customer1);
//		customerRepository.save(customer2);
//		customerRepository.save(customer3);
//		
//		Product p1 =new Product("P1", "pen", 50);
//		Product p2 =new Product("P2", "eraser", 10);
//		Product p3 =new Product("P3", "notebook", 120);
//		
//		productRepository.save(p1);
//		productRepository.save(p2);
//		productRepository.save(p3);
//		
//		Order o1 = new Order();
//		o1.setCustomer(customer1);
//		o1.setDate(new Date());
//		Order savedOrder1 = orderRepository.save(o1);
//		
//		
//		Order o2 = new Order();
//		o2.setCustomer(customer2);
//		o2.setDate(new Date(2022,9,10));
//		Order savedOrder2 = orderRepository.save(o2);
//		
//		LineItem item1 = new LineItem(1, 2, p1, savedOrder1);
//		LineItem item2 = new LineItem(2, 1, p2, savedOrder1);
//		LineItem item3 = new LineItem(3, 5, p3, savedOrder1);
//		LineItem item4 = new LineItem(4, 3, p1, savedOrder2);
//		LineItem item5 = new LineItem(5, 4, p2, savedOrder2);
//		
//		lineItemRepository.save(item1);
//		lineItemRepository.save(item2);
//		lineItemRepository.save(item3);
//		lineItemRepository.save(item4);
//		lineItemRepository.save(item5);
		
	}


	

}
