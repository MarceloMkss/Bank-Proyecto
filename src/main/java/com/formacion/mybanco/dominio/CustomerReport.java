package com.formacion.mybanco.dominio;

import java.util.HashSet;

public class CustomerReport {
	
	public static void main(String[] args) {
		
		
		// Cliente Jane Smith
		Customer cliente = new Customer("Jane ","Smith");
		String name = cliente.getFirstname();
		String apellido = cliente.getLastName();
		System.out.println("Hola " + name + apellido);
		
		// Cuenta de Ahorro
		Account CuentaAhorro = new Account(500.0);
		double saldo = CuentaAhorro.getSaldo();
		System.out.println("Tienes un saldo en tu Cuenta de Ahorro de: " + saldo + " $");
		
		System.out.println("\n**************************************************");
		
		// Cliente Owen Bryant
		Customer cliente2 = new Customer("Owen ","Bryant");
		String name2 = cliente2.getFirstname();
		String apellido2 = cliente2.getLastName();
		System.out.println("Hola " + name2 + apellido2);
		
		//Cuenta corriente
		Account cuentaCorriente = new Account(500.0);			
		double saldo2 = cuentaCorriente.getSaldo();
		System.out.println("Tienes un saldo en tu Cuenta corriente de: " + saldo2 + " $");	
		
		//TODO
		
		
		System.out.println("\n**************************************************");
				
			
				Customer cliente3 = new Customer("Tim ","Soley");
				String name3 = cliente3.getFirstname();
				String apellido3 = cliente3.getLastName();
				System.out.println("Hola " + name3 + apellido3);
				
				//Cuenta corriente
				Account cuentaCorriente2 = new Account(1000.0);
				double saldo3 = cuentaCorriente2.getSaldo();
				System.out.println("Tienes un saldo en tu Cuenta corriente de: " + saldo3 + " $");
				
				
				
				
				
				
	}

}
