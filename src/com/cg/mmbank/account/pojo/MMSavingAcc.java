/*
 * This class inherits the SavingAcc Class
 * The method of withdraw for the Saving Account is defined here
 * For a salary account, the minimum balance required is zero
 * For a non-salary Saving Account, a minimum balance has to be maintained
 */
package com.cg.mmbank.account.pojo;

import com.cg.mmbank.account.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	//A constructor of this class is used to invoke the constructor of SavingAcc class
	public MMSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);

	}

	@Override
	public void withdraw(float amount) {
		{
			if (isSalaried()) {
				if ((getAccBal() - amount) >= 0)
					setAccBal(getAccBal() - amount);
				else {
					System.out.println("Failed");
				}
			} else {
				if ((getAccBal() - amount) >= getMinbal())
					setAccBal(getAccBal() - amount);
				else {
					System.out.println("Failed");
				}
			}
		}

	}
	//displaying the details of the Saving Account
	@Override
	public String toString() {
		return "\nMMSavingAcc = " + super.toString() + ".";
	}

}
