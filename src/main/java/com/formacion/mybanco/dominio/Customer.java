package com.formacion.mybanco.dominio;

import java.io.Serializable;

public class Customer implements Serializable {

	// atributos

	private String firstname;
	private String lastName;

	private Account[] accounts;
	private int numberOfAccounts;

	// constructor

	public Customer() {
		super();

	}

	public Customer(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;

		// inicializar array accounts
		this.accounts = new Account[10];
		this.numberOfAccounts = 0;
	}

	// metodo addAccount

	public void addAccount(Account acct) {
		int i = numberOfAccounts++;
		accounts[i] = acct;
	}

	// Metodo Geterrs y Seterrs
	public String getFirstname() {
		return firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public Account getAccount(int account_index) {
		return accounts[account_index];
	}

	private static final long serialVersionUID = 7233944275693067556L;

}
