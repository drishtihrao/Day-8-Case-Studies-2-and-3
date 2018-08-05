package com.cg.mmbank.account;

//creating an abstract class which inherits the BankAcc class
public abstract class CurrentAcc extends BankAcc {
	// creating instance members for DavingAcc class
	private final float creditLimit = 10000f;

	// defining a parameterised constructor
	public CurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		super(accNo, accNm, accBal);
	}

	//a getter method for credit limit
	public float getCreditLimit() {
		return creditLimit;
	}
	
	@Override
	abstract public void withdraw(float amount);

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + getCreditLimit() + ", toString()=" + super.toString() + "]";
	}
}
