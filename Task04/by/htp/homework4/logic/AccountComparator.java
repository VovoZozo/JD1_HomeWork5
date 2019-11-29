package by.htp.homework4.logic;

import java.util.Comparator;

import by.htp.homework4.entity.Account;

public class AccountComparator implements Comparator<Account> {

	@Override
	public int compare(Account arg0, Account arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Comparator<Account> accountNumberComparator = new Comparator<Account>() {

		@Override
		public int compare(Account e1, Account e2) {
			return e1.getNumber().compareTo(e2.getNumber());
		}

	};

	public static Comparator<Account> accountAmountComparator = new Comparator<Account>() {

		@Override
		public int compare(Account e1, Account e2) {
			return e1.getAmount() - e2.getAmount();
		}

	};
}
