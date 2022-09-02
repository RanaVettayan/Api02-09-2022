package org.abstraction;

public class IciciOfficial extends IciciBank {
	@Override
	public void salaryAccountNumber(int accno) {
	System.out.println("Salary Account No is:"+ accno);		
	}
	@Override
	public void amountFromRbi(int amount) {
		System.out.println("Amont From RBI is:"+ amount);
	}
	public static void main(String[] args) {
		IciciOfficial iciciofficial = new IciciOfficial();
		iciciofficial.personalLoanInterest(6);
		iciciofficial.goldLoanInterest(8);
		iciciofficial.salaryAccountNumber(234564);
		iciciofficial.amountFromRbi(5000000);
				
	}

}
