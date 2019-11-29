package by.htp.homework4.view;

import by.htp.homework4.entity.Client;

public class ClientPrinter {

	public void printClientInformation(Client client) {

		System.out.println(client.getName() + " " + client.getSurname());

		client.getAccounts().forEach(arg -> System.out.println("Account number - " + arg.getNumber() + "\n"
				+ "Status - " + arg.isStatus() + "\n" + "Amount - " + arg.getAmount() + " BYN"));

		System.out.println();
	}

}
