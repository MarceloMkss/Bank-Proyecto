package com.formacion.mybanco.dominio;

public class CheckingAccount extends Account {

	private static final long serialVersionUID = -3359587239234127964L;
	
	
	// Atributos	
	private double overdrafAmount;

	public CheckingAccount(double saldo, double overdrafAmount) {
		super(saldo);
		this.overdrafAmount = overdrafAmount;
	}
	
		
		public CheckingAccount(double saldo) {
		this(saldo, 0.0);
		
	}
		
			
		public boolean withdraw(double amount) {
			boolean result = true;
			if ( saldo < amount ) {
			double overdraftNeeded = amount - saldo;
			if ( overdrafAmount < overdraftNeeded ) {
			result = false;
			} else {
				saldo = 0.0;
				overdrafAmount -= overdraftNeeded;
			}
			} else {
				saldo -= amount;
			}
			return result;
			}

		

		
		
		

}
