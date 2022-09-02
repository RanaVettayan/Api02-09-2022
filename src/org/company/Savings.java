package org.company;

public abstract class Savings extends Fixed {
	public void savingsPecent(int percent) {
		System.out.println("Savings Percent :"+ percent);
	}
	public abstract void savingsAmont(int amount);
	

}
