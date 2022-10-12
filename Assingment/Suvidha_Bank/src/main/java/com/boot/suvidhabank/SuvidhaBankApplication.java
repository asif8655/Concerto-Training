package com.boot.suvidhabank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.suvidhabank.entity.Customer;
import com.boot.suvidhabank.repo.CollateralRepo;
import com.boot.suvidhabank.repo.CustomerRepo;
import com.boot.suvidhabank.service.CustomerService;

@SpringBootApplication
public class SuvidhaBankApplication {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepo customerRepo;

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SuvidhaBankApplication.class, args);
		CustomerService service=context.getBean(CustomerService.class);
		
	}
	
	
	
	
	

}
