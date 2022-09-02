package org.company;

public class Employee extends Project {
	public void empId(int id) {
		System.out.println("Emp Id is:"+ id);
	}

	public void empName(String name) {
		System.out.println("Emp Name is:"+ name);
		
	}
	
	
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.empId(56);
		employee.empName("Raja");
		employee.schoolAccountNuber(2345);
		employee.schoolId(90);
		employee.staffAccountNo(3456);
		employee.staffName("King");		
		employee.studentName("Ramya");
		employee.studentAccountNumber(23456);
		employee.bankName("SBI");
		employee.empAccontNumber(45667);
		employee.fixedPercent(6);
		employee.fixdAmount(450000);
		employee.savingsAmont(55555555);
		employee.savingsPecent(5);
		employee.clientId(67);
		employee.clientName("Priya");
		employee.projecId(87);
		employee.projectName("ios");
		
	}

}
