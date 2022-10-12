package com.boot.suvidhabank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.suvidhabank.entity.Loan;

public interface LoanRepo extends CrudRepository<Loan, String> {
	@Query(value="select * from asif_employee_loan where employeeId=: empId",nativeQuery=true)
	public List<Loan> findAllByEmployeeId(String empId);	

}
