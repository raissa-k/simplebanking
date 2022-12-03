import java.util.Scanner;

import main.java.com.bankingsystem.domain.Account;
import main.java.com.bankingsystem.domain.CheckingAccount;
import main.java.com.bankingsystem.domain.Client;
import main.java.com.bankingsystem.domain.SavingsAccount;

public class Main {
	public static void main(String[] args) {
		Client newClient = new Client();
		System.out.println("Greetings. What is your name?");
		Scanner scanner = new Scanner(System.in);
		String clientName = scanner.next();
		newClient.setName(clientName);
		
		Account checkingAcc = new CheckingAccount(newClient);
		Account savingsAcc = new SavingsAccount(newClient);

		System.out.println("How much would you like to deposit?");
		int depositAmount = scanner.nextInt();
		checkingAcc.deposit(depositAmount);
		
		System.out.println("How much would you like to transfer to your savings account?");
		int transferAmount = scanner.nextInt();
		checkingAcc.transfer(transferAmount, savingsAcc);
		scanner.close();

		checkingAcc.printSummary();
		savingsAcc.printSummary();
	}

}
