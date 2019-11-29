package by.htp.homework4.logic;

import by.htp.homework4.entity.Client;

public class ClientLogic {

	public int accountsAmount(Client client) {

		int sum = 0;
		int i;

		for (i = 0; i < client.getAccounts().size(); i++) {

			sum += client.getAccounts().get(i).getAmount();

		}

		return sum;

	}

	public int accountsPositiveAmount(Client client) {

		int sum = 0;
		int i;

		for (i = 0; i < client.getAccounts().size(); i++) {

			if (client.getAccounts().get(i).getAmount() > 0) {

				sum += client.getAccounts().get(i).getAmount();

			}

		}

		return sum;

	}

	public int accountsNegativiAmount(Client client) {

		int sum = 0;
		int i;

		for (i = 0; i < client.getAccounts().size(); i++) {

			if (client.getAccounts().get(i).getAmount() < 0) {

				sum += client.getAccounts().get(i).getAmount();

			}

		}

		return sum;

	}
}
