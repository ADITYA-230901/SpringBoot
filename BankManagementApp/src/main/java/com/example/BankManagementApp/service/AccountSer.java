package com.example.BankManagementApp.service;

import com.example.BankManagementApp.Model.Account;
import com.example.BankManagementApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AccountSer {
    @Autowired
    AccountRepository repository;

    public Account createAccount(Account account){
        return repository.save(account);
    }
    public Account getDetailsById(Long id){
        return repository.findById(id).orElse(null);
    }
    public List<Account> getAllDetails(){
        return repository.findAll();
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public double addMoney(long id, double value) {
        Account acc = repository.findById(id).orElse(null);
            double bal = acc.getAccount_balance();
            bal = bal + value;
            acc.setAccount_balance(bal);
            repository.save(acc);  // Save the updated account back to the database
        return acc.getAccount_balance();
    }
    public double removeMoney(long id, double value) {
        Account acc = repository.findById(id).orElse(null);
        double bal = acc.getAccount_balance();
        bal = bal - value;
        acc.setAccount_balance(bal);
        repository.save(acc);  // Save the updated account back to the database
        return acc.getAccount_balance();
    }
}
