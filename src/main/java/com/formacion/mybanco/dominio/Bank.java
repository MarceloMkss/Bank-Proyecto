package com.formacion.mybanco.dominio;

public class Bank {

	private static Customer[] customers;
	private static int numberOfCustomers;
	
	static {
		customers = new Customer[10];
		numberOfCustomers = 0;
	}
	
	private Bank() {
		// este constructor no debe llamarse nunca
		}
	
	/**
	 * Metodo para agregar un Cliente
	 * @param firstname Nombre del cliente
	 * @param lastname  Apellido del Cliente
	 */
	public static void addCustomer(String firstname, String lastname ) {
		
		int i = numberOfCustomers++;
		customers[i] = new Customer(firstname, lastname);
	}
	
	public static int getNumOfCustomers() {
		return numberOfCustomers;
		}
	
		public static Customer getCustomer(int customer_index) {
			
			return customers[customer_index];
			
		}
	

	
	
	
}