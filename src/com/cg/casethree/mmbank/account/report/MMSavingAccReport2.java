/*
 * Method to print the list of accounts and the account details on a pdf file
 */
package com.cg.casethree.mmbank.account.report;

import java.util.ArrayList;

import com.cg.mmbank.account.dao.BankCollection;

public class MMSavingAccReport2 implements AccReport {
	public void printReport() {
		System.out.println("REPORT 2 as a pdf file");
		ArrayList al = BankCollection.listAll();
		al.stream().forEach(System.out::println);
	}
}