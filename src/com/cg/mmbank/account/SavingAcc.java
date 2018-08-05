package com.cg.mmbank.account;

//creating an abstract class which inherits the BankAcc class
public abstract class SavingAcc extends BankAcc {
	// creating instance members for DavingAcc class
	private boolean isSalaried;
	private static final float MINBAL = 10000;

	// defining a parameterised constructor
	public SavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.setSalaried(isSalaried);
	}

	public abstract void withdraw(float amount);
	//getters and setters for the instance members
	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried() + ", toString()=" + super.toString() + "]";
	}

}
