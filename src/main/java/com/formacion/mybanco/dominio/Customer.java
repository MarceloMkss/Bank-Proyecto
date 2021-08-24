package com.formacion.mybanco.dominio;

import java.io.Serializable;

public class Customer implements Serializable{


	// atributos
	
	private String firstname;
	private String lastName;
	private Account account;
	
	
	// constructor
		
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(String firstname, String lastName, Account account) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.account = account;
	}



	public String getFirstname() {
		return firstname;
	}



	public String getLastName() {
		return lastName;
	}



	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	// metodo toString	

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastName=" + lastName + ", account=" + account + "]";
	}
	

	private static final long serialVersionUID = 7233944275693067556L;

}
