/*
 * This class implements the abstract methods defined in the parent class Bank Factory
 */
package com.cg.mmbank.factory;

import com.cg.mmbank.account.CurrentAcc;
import com.cg.mmbank.account.SavingAcc;
import com.cg.mmbank.account.pojo.MMCurrentAcc;
import com.cg.mmbank.account.pojo.MMSavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		SavingAcc savingAcc = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentAcc;
	}

}