package com.boot.suvidhabank.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.boot.suvidhabank.entity.Collateral;

public interface CollateralRepo extends CrudRepository<Collateral, String> {
	
	

}
