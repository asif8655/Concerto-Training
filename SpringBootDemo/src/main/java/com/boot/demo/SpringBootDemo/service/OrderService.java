package com.boot.demo.SpringBootDemo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootDemo.entity.CartItems;
import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.LineItem;
import com.boot.demo.SpringBootDemo.entity.Order;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;
import com.boot.demo.SpringBootDemo.repository.LineItemRepository;
import com.boot.demo.SpringBootDemo.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private LineItemRepository lineitemRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	public Integer insertOrder(List<CartItems> cartItems, String username)
	{
		
		Order order = new Order();
		Customer customer = customerRepository.findById(username).get();
		order.setCustomer(customer);
		order.setDate(java.sql.Date.valueOf(LocalDate.now()));
		int total=order.calculate();
		order.setTotal(total);
		Order savedOrder = this.orderRepository.save(order);
		List<LineItem> items = new ArrayList<>();
		for(CartItems cartitem : cartItems)
		{
			LineItem item = new LineItem();
			item.setOrder(savedOrder);
			item.setProduct(cartitem.getProduct());
			item.setQty(cartitem.getQuantity());
			items.add(item);
		}
		order.setLineitems(items);
		
		return savedOrder.getOrderid();
		
		
	}
	@Transactional
	public List<Order> getOrders(String email)
	{
		ArrayList<Order> list = new ArrayList<>();
		this.orderRepository.findByCustomerEmail(email).forEach(list::add);
		for(Order o : list)
			Hibernate.initialize(o.getLineitems());

		return list;
		
	}
}
