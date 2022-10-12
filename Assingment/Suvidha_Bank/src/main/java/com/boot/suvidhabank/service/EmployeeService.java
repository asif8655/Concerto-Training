package com.boot.suvidhabank.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.suvidhabank.entity.Customer;
import com.boot.suvidhabank.entity.Employee;
import com.boot.suvidhabank.entity.Loan;
import com.boot.suvidhabank.repo.EmployeeRepo;
import com.boot.suvidhabank.repo.LoanRepo;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private LoanRepo loanRepo;
	
	public Employee findEmployeeById(String EmployeeId) {
		if(this.employeeRepo.existsById(EmployeeId))
			return this.employeeRepo.findById(EmployeeId).get();
		throw new EntityNotFoundException("Employee with given id is not present");
	}
	
	public boolean SearchEmployee(String EmployeeId) {
		if(this.employeeRepo.findById(EmployeeId).isPresent())
			return true;
		return false;
	}
	
	public boolean insertEmployee(Employee employee) {
		if(!this.employeeRepo.existsById(employee.getEmployeeId())) {
			this.employeeRepo.save(employee);
			return true;	
		}
		return false;
	}
	
	public void approveLoan(String eid) throws Exception {

		if(SearchEmployee(eid)) {

			List<Loan> loans = loanRepo.findAllByEmployeeId(eid);
			if(loans.size()>0) {
				for(Loan loan:loans) {
					Customer customer = loan.getCustomer();
					if(loan.getLoanAmount() > (10 * customer.getAnnualIncome())) {
						loan.setRemarks("Loan amount cannot be 10 times of annual income");
						loan.setApproved(false);
						this.loanRepo.save(loan);
						
					}
					else if(loan.getCollateral() == null || loan.getCollateral().size() == 0) {
						loan.setRemarks( "No collateral submitted");
						loan.setApproved(false);
						this.loanRepo.save(loan);
						
					}
					else if(!customer.isIncomeTaxReturnAttached()) {
						loan.setRemarks( "Income proof not attached");
						loan.setApproved(false);
						this.loanRepo.save(loan);
						
					}
					else if(customer.getCustomerIdentity() == null) {
						loan.setRemarks( "Identity document not submitted");
						loan.setApproved(false);
						this.loanRepo.save(loan);
						
					}
					else
					{
						loan.setRemarks( "Approved");
						loan.setApproved(true);
						
						this.loanRepo.save(loan);
						
					}
				}
			}
		}
	}

}
