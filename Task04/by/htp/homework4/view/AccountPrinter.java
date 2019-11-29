package by.htp.homework4.view;

import by.htp.homework4.entity.Account;

public class AccountPrinter {

	public void printAccountInformation(Account account) {

		System.out.println("Account number - " + account.getNumber() + "\n" + "Status - " + account.isStatus() + "\n"
				+ "Amount - " + account.getAmount() + " BYN");

		System.out.println();
	}

}
