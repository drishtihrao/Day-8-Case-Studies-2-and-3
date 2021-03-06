package com.cg.mmbank.account;

//Abstract Bank account class 
public abstract class BankAcc {
	//creating instance members 
	private int accNo;
	private String accNm;
	private float accBal;
	
	//creating a parameterised constructor for creating a BankAcc
	public BankAcc(int accNo, String accNm, int accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	//getters and setters for the instance members
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public int getAccNo() {
		return accNo;
	}

	public float getAccBal() {
		return accBal;
	}

	abstract public void withdraw(float amount);

	public void deposit(float amount) {
		this.accBal += amount;
	}

	@Override
	public String toString() {
		return "\nBankAcc with accNo = " + accNo + ", accNm = " + accNm + ", accBal = " + accBal + ".";
	}

}