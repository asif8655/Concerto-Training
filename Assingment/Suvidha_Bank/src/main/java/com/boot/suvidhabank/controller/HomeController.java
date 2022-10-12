package com.boot.suvidhabank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.suvidhabank.entity.Collateral;
import com.boot.suvidhabank.entity.Customer;
import com.boot.suvidhabank.entity.Employee;
import com.boot.suvidhabank.entity.Loan;
import com.boot.suvidhabank.repo.CollateralRepo;
import com.boot.suvidhabank.service.CollateralService;
import com.boot.suvidhabank.service.CustomerService;
import com.boot.suvidhabank.service.EmployeeService;
import com.boot.suvidhabank.service.LoanService;

@RestController
public class HomeController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CollateralRepo collateralRepo;
	
	@Autowired
	private LoanService loanService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private CollateralService collateralService;
	

	@PostMapping("/customer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		this.customerService.insertCustomer(customer);
		return ResponseEntity.of(Optional.of("Success"));
	}
	
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
//		System.out.println(id);
	Customer c= this.customerService.findCustomerByEmail(id);
	return ResponseEntity.of(Optional.of(c));
	
	}
	
	@PostMapping("/{email}")
	public ResponseEntity<Loan> applyForLoan(@RequestBody Loan loan,@PathVariable String email) throws Exception 
	{	
		System.out.println(loan);
		Loan l= this.loanService.applyForLoan(loan.getLoanType(),loan.getLoanAmount(),loan.getPeriod(),email);
		return ResponseEntity.of(Optional.of(l));
	}
	
	@GetMapping("/loan/{id}")
	public ResponseEntity<Loan> getLoanById(@PathVariable String id) {
		Loan l=this.loanService.findLoanById(id);
		return ResponseEntity.of(Optional.of(l));
	}
	

	
	@PostMapping("/emp")
	public ResponseEntity<String> insertEmployee(
			@RequestBody Employee employee)
	{
		try {
			this.employeeService.insertEmployee(employee);
			 return ResponseEntity.of(Optional.of("Success"));
		}
		catch(Exception e)
		{
			return ResponseEntity.of(Optional.of("Not Success"));
		}
	}
	
	@GetMapping("emp/{id}")
	public Employee findByEmployeeId(@PathVariable String id) {
		
		return this.employeeService.findEmployeeById(id);
	}
	
	@PostMapping("/coll")
	public ResponseEntity<String> addCollateral(@RequestBody Collateral collateral){
		
		System.out.println(collateral);
		if(this.collateralService.insertCollateral(collateral))
		{
		return ResponseEntity.of(Optional.of("Success"));
		}
		return ResponseEntity.of(Optional.of("Not Success"));
	}
	
	@PostMapping("/upload/{loanid}")
	public ResponseEntity<String> uploadCollaterals(
			@PathVariable String loanid,
			@RequestBody List<Collateral> coll
			)
	{
		System.out.println(loanid+" " + coll);
		 if(this.loanService.uploadCollateral(loanid, coll))
			 return ResponseEntity.of(Optional.of("Success"));
		 return ResponseEntity.of(Optional.of("Not Success"));
//		return null;
		
	}
	
	@GetMapping("/emp/{empid}")
	public ResponseEntity<String> approveLoans(@PathVariable String empid)
	{
		try {
			this.employeeService.approveLoan(empid);
		}
		catch(Exception e )
		{
			return ResponseEntity.of(Optional.of("Failed to update"));
		}
		return ResponseEntity.of(Optional.of("Status Update"));
	}
	

	
	
	
	
}
