/*
 * All the operations requested by the user through the entry point is directed to the Bank Controller
 * Bank Controller processes the request of each user and calls the required method accordingly
 */
package com.cg.mmbank.controller;

import com.cg.mmbank.account.BankAcc;
import com.cg.mmbank.account.dao.BankCollection;
import com.cg.mmbank.factory.BankFactory;

public abstract class BankController {
	private BankCollection bc;
	private BankFactory bf;
	
	public BankController(BankFactory bf) {
		this.bf = bf;
	}
	//creating abstract methods with constructors
	abstract public void createNewCurrentAccount(int accNo, String accNm, int accBal, float creditLimit);
	abstract public void createNewSavingAccount(int  accNo, String accNm, int accBal, boolean isSalaried);
	abstract public BankAcc presentAccountToView(int accNo, String str);
	
}
