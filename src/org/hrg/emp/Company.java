package org.hrg.emp;

public class Company extends Employee {
	
	public void compId() {
		
		System.out.println("hcl");
	}
  
	public static void main(String[] args) {
		
		Company c = new Company();
		c.compId();
		c.empName();
	}
}
