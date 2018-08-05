/*
 * Method to print the list of accounts and the account details on a text file
 */
package com.cg.casethree.mmbank.account.report;

import java.util.ArrayList;

import com.cg.mmbank.account.dao.BankCollection;

public class MMSavingAccReport1 implements AccReport {
	public void printReport() {
		System.out.println("REPORT 1 - in .txt");
		ArrayList al = BankCollection.listAll();
		al.stream().forEach(System.out::println);
	}
}
