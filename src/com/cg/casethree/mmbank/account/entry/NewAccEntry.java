/*
 * Creating an abstract method of return type NewSavingPojo
 */
package com.cg.casethree.mmbank.account.entry;

import com.cg.casethree.mmbank.account.pojo.NewSavingPojo;

public interface NewAccEntry {
	public abstract NewSavingPojo readAccInfo(int accNm);
}
