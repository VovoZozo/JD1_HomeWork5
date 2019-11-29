package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.homework4.entity.Account;
import by.htp.homework4.entity.Client;
import by.htp.homework4.logic.AccountComparator;
import by.htp.homework4.logic.AccountSearch;
import by.htp.homework4.logic.ClientLogic;
import by.htp.homework4.view.AccountPrinter;
import by.htp.homework4.view.BalancePrinter;
import by.htp.homework4.view.ClientPrinter;

public class ClientMain {

	public static void main(String[] args) {

		Account account1 = new Account("465461255HGFkjgjVD5463123254", 123552, true);
		Account account2 = new Account("65432216123dkjhfgsJHK68798151", -32151);
		Account account3 = new Account("5465455dfbkjfk665465465j", 645125, true);
		Account account4 = new Account("64512654641231HGJJHGKJHD51354654321", -32151);
		Account account5 = new Account("654654fdjkhdkndlkvs554s6d54sdjhgs645", 46512, true);
		Account account6 = new Account("4651321dgsdjsndlkdfvs546sdsvjbs654651", -4561);

		List<Account> accounts1 = new ArrayList<Account>();
		accounts1.add(account1);
		accounts1.add(account2);
		accounts1.add(account3);

		List<Account> accounts2 = new ArrayList<Account>();
		accounts2.add(account4);
		accounts2.add(account5);
		accounts2.add(account6);

		Client client1 = new Client("Vova", "Minch", accounts1);
		Client client2 = new Client("Oleg", "Fudzi", accounts2);

		ClientPrinter print = new ClientPrinter();
		print.printClientInformation(client1);
		print.printClientInformation(client2);

		Collections.sort(client1.getAccounts(), AccountComparator.accountNumberComparator);
		print.printClientInformation(client1);

		Collections.sort(client2.getAccounts(), AccountComparator.accountAmountComparator);
		print.printClientInformation(client2);

		AccountSearch searh = new AccountSearch();

		Account account = searh.findAccountByNumber(client1, "5465455DFBKJFK665465465J");
		AccountPrinter printAccount = new AccountPrinter();
		printAccount.printAccountInformation(account);

		ClientLogic logic = new ClientLogic();

		int amount = logic.accountsAmount(client1);
		int amountPositivi = logic.accountsPositiveAmount(client1);
		int amountNegative = logic.accountsNegativiAmount(client1);

		BalancePrinter printAmount = new BalancePrinter();
		printAmount.printAmount(amount);
		printAmount.printAmount(amountPositivi);
		printAmount.printAmount(amountNegative);
	}

}
