import main.java.com.bankingsystem.domain.Account;
import main.java.com.bankingsystem.domain.CheckingAccount;
import main.java.com.bankingsystem.domain.Client;
import main.java.com.bankingsystem.domain.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Client andrey = new Client();
		andrey.setName("Andrey");
		
		Account checkingAcc = new CheckingAccount(andrey);
		Account savingsAcc = new SavingsAccount(andrey);

		checkingAcc.deposit(100);
		checkingAcc.transfer(100, savingsAcc);
		
		checkingAcc.printSummary();
		savingsAcc.printSummary();
	}

}
