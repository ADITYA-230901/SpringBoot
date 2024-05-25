package com.example.BankManagementApp.service;

import com.example.BankManagementApp.Model.Account;

import java.util.ArrayList;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getAccByAccNo(Long account_number);
    public ArrayList<Account> getAllAccounts();
    public Account depositMoney(Long accountNumber,Double amount);
    public Account withdrawMoney(Long accountNumber,Double amount);
    public void closeAccount(long accountNumber);
}
