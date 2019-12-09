package by.htp.homework4.logic;

import by.htp.homework4.entity.Account;
import by.htp.homework4.entity.Client;

public class AccountSearch {

	public Account findAccountByNumber(Client client, String number) {

		int i;

		for (i = 0; i < client.getAccounts().size(); i++) {

			if (client.getAccounts().get(i).getNumber().equals(number)) {
				return client.getAccounts().get(i);
			}

		}

		return null;

	}
}
