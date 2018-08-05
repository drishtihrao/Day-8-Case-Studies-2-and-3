/*
 * Bank Collection class maintains an array list of all the bank accounts
 * Whenever a new Bank Account is created, it gets added to this array list
 */
package com.cg.mmbank.account.dao;

import java.util.ArrayList;

import com.cg.mmbank.account.BankAcc;

public class BankCollection {
	public static ArrayList<BankAcc> al=new ArrayList<>();
	//method to add new account
	public void addNewAccount(BankAcc ba) {
		al.add(ba);
	}
	//method to display all the accounts present in the list
	public static ArrayList listAll() {
		return al;
	}
}