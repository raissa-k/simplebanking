package main.java.com.bankingsystem.domain;

public class SavingsAccount extends Account {

	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void transfer(double amount, Account contaDestino) {
		this.withdraw(amount);
		contaDestino.deposit(amount);
	}

	@Override
	public void printSummary() {
		System.out.println("===SAVINGS ACCOUNT SUMMARY===");
		super.printSummary();
	}
}
