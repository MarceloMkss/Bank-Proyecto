package com.formacion.mybanco.dominio;

import java.io.Serializable;

public class Account implements Serializable{


	// atributos
	protected double saldo;
	
	
	// constructor
	
	protected Account(double saldo) {
		super();
		this.saldo = saldo;
	}


	//getter y setter
	
	public double getSaldo() {
		return saldo;
	}
	
	
	//Metodo para el saldo
	public boolean depositar(double amt) {
		
		saldo = saldo + amt;
		
		return true;
		}
	
	
	//Metodo para el resultado
	public boolean withdraw(double amt) {
		
		boolean resultado = false;
		if ( amt <= saldo ) {
			saldo = saldo - amt;
			resultado = true;
		}
		
		return resultado;
		
		
	}


	//toString	
	
	@Override
	public String toString() {
		return "Account [saldo=" + saldo + "]";
	}


	//Serializable

	private static final long serialVersionUID = -4717636299159430636L;


	

}
