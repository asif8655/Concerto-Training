package com.boot.suvidhabank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Entity
@Table(name="asif_customer_loan")
public class Customer {
	
	@Id
	private String emailId;
	private String customerIdentity;
	private String customerName;
	private String customerAddress;
	private double annualIncome;
	private boolean incomeTaxReturnAttached;
	@OneToOne(mappedBy = "customer")
	private Loan loan;
	public Customer(String customerIdentity, String customerName, String emailId, String customerAddress,
			double annualIncome, boolean incomeTaxReturnAttached) {
		super();
		this.customerIdentity = customerIdentity;
		this.customerName = customerName;
		this.emailId = emailId;
		this.customerAddress = customerAddress;
		this.annualIncome = annualIncome;
		this.incomeTaxReturnAttached = incomeTaxReturnAttached;
	}
	@Override
	public String toString() {
		return "Customer [emailId=" + emailId + ", customerIdentity=" + customerIdentity + ", customerName="
				+ customerName + ", customerAddress=" + customerAddress + ", annualIncome=" + annualIncome
				+ ", incomeTaxReturnAttached=" + incomeTaxReturnAttached + "]";
	}
	
	
	

}
