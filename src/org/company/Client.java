package org.company;

public class Client extends Savings {
	public void clientName(String name) {
		System.out.println("Client Name is:"+ name);
	}
public void clientId(int id) {
	System.out.println("Client Id is:"+ id);
	
}
@Override
public void studentName(String name) {
	System.out.println("Student Name is:"+ name);
}
@Override
public void studentAccountNumber(int accno) {
	System.out.println("Studen Account Nuber is:"+ accno);
}
@Override
public void staffName(String name) {
	System.out.println("Staff Name is:"+name);
	
}
@Override
public void staffAccountNo(int accno) {
	 System.out.println("Staff Account No:"+ accno);		
	
}
@Override
public void schoolAccountNuber(int accno) {
	System.out.println("School Account Number is:"+ accno);

}
@Override
public void schoolId(int id) {
	System.out.println("School Id is:"+ id);

}
@Override
public void savingsAmont(int amount) {
	System.out.println("Savings Amont :"+ amount);
}
@Override
public void fixdAmount(int amount) {
	System.out.println("Fixed Amont :"+ amount);
}
@Override
public void empAccontNumber(int accno) {
	System.out.println("Employee account No:"+ accno);
	
}
}
