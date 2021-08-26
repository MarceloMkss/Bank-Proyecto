package com.formacion.mybanco.dominio;

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
		
		// Cliente Owen Bryant
		Customer cliente2 = new Customer("Owen ","Bryant");
		String name2 = cliente2.getFirstname();
		String apellido2 = cliente2.getLastName();
		System.out.println("Hola " + name2 + apellido2);
		
		//Cuenta corriente
		Account cuentaCorriente = new Account(500.0);
		double saldoContaCorriente = cuentaCorriente.getSaldo();
		System.out.println("Tienes un saldo en tu Cuenta corriente de: " + saldoContaCorriente + " $");
		
				
		
		
	}

}
