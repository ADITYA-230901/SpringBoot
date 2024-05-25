package com.example.BankManagementApp.controller;

import com.example.BankManagementApp.Model.Account;
import com.example.BankManagementApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController
{
    @Autowired
    AccountService service;
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createAccount(account));
    }
    @GetMapping("/{account_number}")
    public  Account getAccByAccNo(@PathVariable("account_number") Long account_number){
        return service.getAccByAccNo(account_number);
    }
}
