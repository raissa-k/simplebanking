package main.java.com.bankingsystem.repository;

import main.java.com.bankingsystem.domain.Account;

public interface IAccountRepository {
    public void create(Account conta);
    public void read(Account conta);
    public void update(Account conta);
    public void delete(Account conta);
}
