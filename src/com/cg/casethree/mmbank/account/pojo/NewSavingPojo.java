package com.cg.casethree.mmbank.account.pojo;

public class NewSavingPojo {
	//creating instance members for the class
	private String accName;
	private int accNm;
	private float accBal;
	private boolean isSal;

	//creating parameterized constructor for the class
	public NewSavingPojo(String accName, int accNm, float accBal) {
		this.accName = accName;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	//getters and setters for the instance members
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getAccNm() {
		return accNm;
	}

	public void setAccNm(int accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public boolean isSal() {
		return isSal;
	}

	public void setSal(boolean isSal) {
		this.isSal = isSal;
	}

	//displaying all the account details
	@Override
	public String toString() {
		return "NewSavingPojo accName = " + accName + ", accNm = " + accNm + ", accBal = " + accBal + ", isSal = " + isSal
				+ ".";
	}

}
