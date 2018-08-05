/*
 * Class to test and implement all the withdraw, deposit methods along with creating new acounts
 */
package com.cg.mmbank.view;

import java.util.ArrayList;
import java.util.Scanner;
import com.cg.casethree.mmbank.account.pojo.NewSavingPojo;
import com.cg.casethree.mmbank.account.report.MMSavingAccReport1;
import com.cg.casethree.mmbank.account.view.MMNewSaveAccEntryConsole;
import com.cg.mmbank.account.BankAcc;
import com.cg.mmbank.account.CurrentAcc;
import com.cg.mmbank.account.SavingAcc;
import com.cg.mmbank.account.dao.BankCollection;
import com.cg.mmbank.controller.BankController;
import com.cg.mmbank.controller.MMBankController;
import com.cg.mmbank.factory.BankFactory;
import com.cg.mmbank.factory.MMBankFactory;

public class EntryPoint {
	public static void main(String[] args) {
		BankFactory mmBankFactory = new MMBankFactory();
		BankController mmBankController = new MMBankController(mmBankFactory);

		mmBankController.createNewCurrentAccount(105, "Pr", 18000000, 4000);
		mmBankController.createNewSavingAccount(105, "PK", 500000, false);

		ArrayList arrl = BankCollection.listAll();
		System.out.println(arrl);

		System.out.println("------------------------------------------");
		BankAcc str = mmBankController.presentAccountToView(105, "com.cg.mmbank.account.pojo.MMSavingAcc");
		System.out.println(str);

		SavingAcc mmSavingAcc = mmBankFactory.getNewSavingAcc(105, "PK", 500000, false);
		mmSavingAcc.withdraw(6000);
		System.out.println(mmSavingAcc);

		CurrentAcc mmCurrentAcc = mmBankFactory.getNewCurrentAcc(105, "Pr", 18000000, 4000);
		mmCurrentAcc.withdraw(8000);
		System.out.println(mmCurrentAcc);

		System.out.println("------------------------------------------");
		mmCurrentAcc.deposit(8000);
		System.out.println(mmCurrentAcc);

		mmSavingAcc.deposit(6000);
		System.out.println(mmSavingAcc);

		System.out.println("------------------------------------------");
		System.out.println("Case Stuy 3 output");

		Scanner scanner = new Scanner(System.in);
		System.out.println("---------CONSOLE---------");
		System.out.println("Enter account number");
		int accNo = scanner.nextInt();
		MMNewSaveAccEntryConsole a = new MMNewSaveAccEntryConsole();
		NewSavingPojo newSavingPojo = a.readAccInfo(accNo);
		System.out.println(newSavingPojo);

		System.out.println("------------------------------------------");
		MMSavingAccReport1 m = new MMSavingAccReport1();
		m.printReport();

	}
}
