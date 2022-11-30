package main.java.com.bankingsystem.application.impl;

import main.java.com.bankingsystem.application.IAccountApplication;
import main.java.com.bankingsystem.domain.Account;
import main.java.com.bankingsystem.repository.impl.AccountRepositoryImpl;

public class AccountApplicationImpl implements IAccountApplication {
    private AccountRepositoryImpl accountRepository;
    @Override
    public void create(Account account) {
        accountRepository.create(account);
    }

    @Override
    public void read(Account account) {
        accountRepository.read(account);
    }

    @Override
    public void update(Account account) {
        accountRepository.read(account);
    }

    @Override
    public void delete(Account account) {
        accountRepository.delete(account);
    }
}
