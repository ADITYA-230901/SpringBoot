package com.example.BankManagementApp.service;

import com.example.BankManagementApp.Model.Account;
import com.example.BankManagementApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AccountServiceImplementation implements AccountService{

    @Autowired
    AccountRepository repository;
    @Override
    public Account createAccount(Account account) {
        Account saved=repository.save(account);
        return saved;
    }

    @Override
    public Account getAccByAccNo(Long account_number) {
        return repository.findByAccountNumber(account_number);
//        if(acc.isEmpty()){
//            throw new RuntimeException("Account not found");
//        }
//        return acc.get();
    }

    @Override
    public ArrayList<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account depositMoney(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public Account withdrawMoney(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public void closeAccount(long accountNumber) {

    }
}
