package org.hrg.emp;

public class Client extends Employee {
	
	public void clientName() {
		
		System.out.println("Sree");
	}
	public static void main(String[] args) {
		
		Client c = new Client();
		c.clientName();
		c.empName();
	}

}
