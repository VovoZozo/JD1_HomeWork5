package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Client {

	private String name;
	private String surname;
	private List<Account> accounts;

	public Client(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Client(String name, String surname, List<Account> accounts) {
		this.name = name;
		this.surname = surname;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accounts, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(accounts, other.accounts) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", surname=" + surname + ", accounts=" + accounts + "]";
	}

}
