package by.htp.homework4.entity;

import java.util.Objects;

public class Account {

	private String number;
	private int balance;
	private boolean status;

	public Account() {
		this.number = "empty";
		this.status = false;
	}

	public Account(String number, int amount) {
		this.balance = amount;
		this.number = number.toUpperCase();
		this.status = false;
	}

	public Account(String number, int amount, boolean status) {
		this.balance = amount;
		this.number = number.toUpperCase();
		this.status = status;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAmount() {
		return balance;
	}

	public void setAmount(int amount) {
		this.balance = amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(balance, number, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return balance == other.balance && Objects.equals(number, other.number) && status == other.status;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", amount=" + balance + ", status=" + status + "]";
	}

}
