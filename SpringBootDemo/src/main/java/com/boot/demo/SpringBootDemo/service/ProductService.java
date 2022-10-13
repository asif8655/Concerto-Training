package com.boot.demo.SpringBootDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.Product;
import com.boot.demo.SpringBootDemo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		ArrayList<Product> list = new ArrayList<>();
		this.productRepository.findAll().forEach(list::add);

		return list;
		
	}

	public boolean saveOrUpdate(Product product) {
		
		if(this.productRepository.existsById(product.getPid()))
		{
			throw new EntityExistsException("Product with"+product.getPid()+"already exist");
		}
		this.productRepository.save(product);
		return true;
	}

	public boolean delete(String id) {
		
		if(! this.productRepository.existsById(id))
		{
			throw new EntityNotFoundException("Product with "+id+" cannot be deleted as it NOTs exists");		
		}
		this.productRepository.deleteById(id);
		
		return true;
		
	}

	public Product get(String id) {
		Optional<Product> optCust = this.productRepository.findById(id);
		return optCust.orElseThrow(()->new EntityNotFoundException("Product with "+id+" not found"));
	}
}
