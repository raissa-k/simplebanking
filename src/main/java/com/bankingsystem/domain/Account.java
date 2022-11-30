package main.java.com.bankingsystem.domain;

public abstract class Account {
	
	private static final int STD_AGENCY = 1;
	private static int AccSequential = 1;
	protected int agency;
	protected int accNumber;
	protected double balance;
	protected Client client;

	protected Account(Client client) {
		this.agency = Account.STD_AGENCY;
		this.accNumber = AccSequential++;
		this.client = client;
	}

	public int getAgency() {
		return agency;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void withdraw(double amount);

	public abstract void deposit(double amount);

	public abstract void transfer(double amount, Account contaDestino);

	public void printSummary() {
		System.out.println("Agency: " + this.getAgency());
		System.out.println("Account number: " + this.getAccNumber());
		System.out.println("Balance: " + this.getBalance());
	}
}
