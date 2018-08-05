/*
 * The creation of new Saving Acc and new Current Account is done in the Bank Factory
 * This abstract class defines instance members of type SavingAcc and CurrentAcc respectively
 */
package com.cg.mmbank.factory;

import com.cg.mmbank.account.CurrentAcc;
import com.cg.mmbank.account.SavingAcc;

public abstract class BankFactory { 
	 public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried); 
	 public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit); 
	 }
