package main.java.com.bankingsystem.domain;

public class CheckingAccount extends Account {

	public CheckingAccount(Client cliente) {
		super(cliente);
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
		System.out.println("===CHECKING ACCOUNT BALANCE===");
		super.printSummary();
	}
}
