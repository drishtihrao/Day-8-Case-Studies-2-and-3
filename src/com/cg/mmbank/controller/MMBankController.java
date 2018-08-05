/*
 * This class implements the methods defined in Parent class BankController
 */
package com.cg.mmbank.controller;

import com.cg.mmbank.account.BankAcc;
import com.cg.mmbank.account.dao.BankCollection;
import com.cg.mmbank.factory.BankFactory;

public class MMBankController extends BankController {
	private BankCollection bc;
	private BankFactory bf;

	public MMBankController(BankFactory bf) {
		super(bf);
		this.bf = bf;
		bc = new BankCollection();
	}

	@Override
	public void createNewSavingAccount(int accNo, String accNm, int accBal, boolean isSalaried) {
		BankAcc ba = bf.getNewSavingAcc(accNo, accNm, accBal, isSalaried);
		bc.addNewAccount(ba);
	}

	@Override
	public void createNewCurrentAccount(int accNo, String accNm, int accBal, float creditLimit) {
		BankAcc ba = bf.getNewCurrentAcc(accNo, accNm, accBal, creditLimit);
		bc.addNewAccount(ba);
	}

	@Override
	public BankAcc presentAccountToView(int accNo, String str) {
		// al.stream(accNo).forEach(accNumber) -> System.out.println(BankAcc);
		String details = new String();
		BankAcc tempBA = null;
		for (BankAcc ba : bc.al) {
			if (ba.getAccNo() == accNo && ba.getClass().getName().equals(str)) {
				tempBA = ba;
			}
		}
		return tempBA;
	}
}
