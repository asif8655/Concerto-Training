package com.boot.suvidhabank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.suvidhabank.entity.Collateral;
import com.boot.suvidhabank.repo.CollateralRepo;

@Service
public class CollateralService {
	@Autowired
	private CollateralRepo collateralRepo;
	
	public boolean insertCollateral(Collateral collateral) {
		if(!this.collateralRepo.existsById(collateral.getCollateralId())) {
			this.collateralRepo.save(collateral);
			return true;
		}
		return false;
	}
	
	public List<Collateral> getAllCollaterals() throws Exception
	{
		List<Collateral> collaterals = new ArrayList<Collateral>();
		this.collateralRepo.findAll().forEach(collateral-> collaterals.add(collateral));
		return collaterals;
	}
	

}
