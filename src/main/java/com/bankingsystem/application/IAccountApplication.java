package main.java.com.bankingsystem.application;

import main.java.com.bankingsystem.domain.Account;

public interface IAccountApplication {
	
	void create(Account conta);

	void read(Account conta);
	void update(Account conta);
	
	void delete(Account conta);
}
