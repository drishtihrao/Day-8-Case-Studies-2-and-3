/*
 * This class inherits class NewAccENtry
 * The function readAccInfo of parent class is overridden in this class
 */
package com.cg.casethree.mmbank.account.view;

import com.cg.casethree.mmbank.account.entry.NewAccEntry;
import com.cg.casethree.mmbank.account.pojo.NewSavingPojo;

public class MMNewAccEntryGUI implements NewAccEntry{

	@Override
	public NewSavingPojo readAccInfo(int accNm) {
		return null;
	}
}
