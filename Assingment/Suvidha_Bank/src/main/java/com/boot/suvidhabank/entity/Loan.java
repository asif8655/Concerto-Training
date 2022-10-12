package com.boot.suvidhabank.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="asif_loan")
public class Loan {
	
	@Id
	private String loanId;
	private String loanType;
	private double loanAmount;
	private double interestRate;
	private double period;
	private boolean isApproved;
	private String remarks;
	@OneToOne
	@JoinColumn(name="customer_id")
	@JsonIgnore
	private Customer customer;
	@OneToOne
	@JoinColumn(name="Employee_id")
	private Employee employee;
	@OneToMany(mappedBy = "loan")
	private  List<Collateral> collateral;
	

}
