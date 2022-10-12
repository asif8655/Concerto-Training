package com.boot.suvidhabank.constant;

public class Constant {
	
	public static final String Loan_Type[]= {"Buying Home","Vehicle","Education","Marriage","Hospitalization"};
	public static final String Id_Type[]= {"Passport","Adhar Card","Driving License"};
	public static final String Collateral_Type[]= {"Vehicle","Home","Insurance Documents","Fixed Deposits"};
	
	public static double calculateIntrestRate(double period) {
		if(period<=2)
			return 0.05;
		else if(period>2&&period<=5)
			return 0.06;
		else if(period>5&&period<=8)
			return 0.08;
		else 
			return 0.085;
	}

}

