/*
 * This class inherits the CurrentAcc Class
 * The method of withdraw for the Current Account is defined here
 * In a current account, the user is allowed to deposit a total amount more than his balance
 * The total amount withdrawable is the sum of the account balance and the credit limit
 * The credit limit for the customer might vary according to certain rule of the bank
 */
package com.cg.mmbank.account.pojo;

import com.cg.mmbank.account.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	// A constructor of this class is used to invoke the constructor of CurrentAcc Class
	public MMCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float amount) {
		if (((getAccBal() + getCreditLimit()) - amount) >= 0)
			setAccBal(getAccBal() - amount);
		else {
			System.out.println("Failed");
		}
	}

	// displaying the details of the Current Account
	@Override
	public String toString() {
		return "\nMMCurrentAcc = " + super.toString() + ".";
	}

}
