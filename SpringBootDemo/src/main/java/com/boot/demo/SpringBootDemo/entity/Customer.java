package com.boot.demo.SpringBootDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//At entity annotation tells springboot that customer is database manage an entity
@Entity
//Because email is a primary key so that you can add annotation ID
@Table(name="Customer_mehmood")
public class Customer {

	@Id
	private String email;
	
	private String custname;
	private String password;
	private String city;
	private String phone;

	
}
