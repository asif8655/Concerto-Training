package com.boot.suvidhabank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.suvidhabank.constant.Constant;
import com.boot.suvidhabank.entity.Collateral;
import com.boot.suvidhabank.entity.Employee;
import com.boot.suvidhabank.entity.Loan;
import com.boot.suvidhabank.repo.CollateralRepo;
import com.boot.suvidhabank.repo.CustomerRepo;
import com.boot.suvidhabank.repo.EmployeeRepo;
import com.boot.suvidhabank.repo.LoanRepo;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepo loanRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private CollateralRepo collateralRepo;
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Loan findLoanById(String loanId) {
		Optional<Loan> optl=this.loanRepo.findById(loanId);
		return optl.orElseThrow(()->new EntityNotFoundException("Loan not found"));
		
	}
	
	public boolean uploadCollateral(String loanId, List<Collateral> collateral) 
	{
		Optional<Loan> loan = this.loanRepo.findById(loanId);
		System.out.println("Getting loan id from upload"+loan.get());
		if(!loan.isPresent()) {
			System.out.println("loan does not exist");
			return false;
		} 
		loan.ifPresent(l->{
			
			List<Collateral> collaterals = new ArrayList<Collateral>();
			collateral.forEach(id->{
				collaterals.add(this.collateralRepo.findById(id.getCollateralId()).get());
			});
			System.out.println(collaterals);
			l.setCollateral(collaterals);
			this.loanRepo.save(l);
		});
		return true;		
	}
	
	public Loan applyForLoan(String loanType,
			double loanAmount,
			double period, String email)
	{
		System.out.println("applying for loan");
		Loan loan = new Loan();
		loan.setCustomer(customerRepo.findById(email).get());
		loan.setInterestRate(Constant.calculateIntrestRate(period));
		loan.setPeriod(period);
		loan.setLoanType(loanType);
		loan.setLoanAmount(loanAmount);
		System.out.println(period+" "+loanType+" "+loanAmount);
		int index = (int)(Math.random()* (employeeRepo.count()));
		System.out.println("index "+index);
		List<Employee> emps = new ArrayList<>();
		this.employeeRepo.findAll().forEach(emp->emps.add(emp));
		loan.setEmployee(emps.get(index));
		loan.setLoanId("Suvidha"+(this.loanRepo.count()+1));
		loanRepo.save(loan);
		return loan;
	}

	

}
