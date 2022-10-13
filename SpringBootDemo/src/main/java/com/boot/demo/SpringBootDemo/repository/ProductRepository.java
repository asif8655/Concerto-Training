package com.boot.demo.SpringBootDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootDemo.entity.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
