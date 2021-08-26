package com.formacion.mybanco.dominio;

public class SavingsAccount extends Account{	

	private static final long serialVersionUID = -801096470875342125L;
	
	private double interestRate;

	public SavingsAccount(double saldo, double interestrate) {
		super(saldo);
		this.interestRate = interestrate;
	}

	
	



	
	

}
