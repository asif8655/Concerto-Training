package com.boot.suvidhabank.repo;

import org.springframework.data.repository.CrudRepository;

import com.boot.suvidhabank.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, String> {

}
