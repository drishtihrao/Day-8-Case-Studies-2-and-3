/*
 * This class inherits class NewAccENtry
 * The function readAccInfo of parent class is overridden in this class
 */
package com.cg.casethree.mmbank.account.view;

import com.cg.casethree.mmbank.account.entry.NewAccEntry;
import com.cg.casethree.mmbank.account.pojo.NewSavingPojo;
import com.cg.mmbank.account.BankAcc;
import com.cg.mmbank.controller.MMBankController;

public class MMNewSaveAccEntryConsole implements NewAccEntry{
	
	@Override
	public NewSavingPojo readAccInfo(int accNm) {
		MMBankController mmBankController = new MMBankController(null); 
		String str = "com.cg.mmbank.account.pojo.MMSavingAcc";
		BankAcc ba = mmBankController.presentAccountToView(accNm, str);
		NewSavingPojo newSavingPojo = new NewSavingPojo(ba.getAccNm(),ba.getAccNo(),ba.getAccBal());
		return newSavingPojo;
		
		
	}
	
}