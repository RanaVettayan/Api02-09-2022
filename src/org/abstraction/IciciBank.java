package org.abstraction;

public abstract class IciciBank {
	public void personalLoanInterest(int percent) {
		System.out.println("Personal Loan Interest is:"+ percent);
	}
	public void goldLoanInterest(int percent) {
		System.out.println("Gold Loan Interest is:"+ percent);
	}
public abstract void salaryAccountNumber(int accno);
public abstract void amountFromRbi(int amount );

}
