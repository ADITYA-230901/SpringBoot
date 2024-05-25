package com.example.BankManagementApp.controller;

import com.example.BankManagementApp.Model.Account;
import com.example.BankManagementApp.service.AccountSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController
{
    @Autowired
    AccountSer service;
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createAccount(account));
    }
    @GetMapping("/{id}")
    public  Account getDetailsById(@PathVariable long id){
        return service.getDetailsById(id);
    }
    @GetMapping("/")
    public List<Account> getAllDetails(){
        List<Account> acc=service.getAllDetails();
        return acc;
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
    @PutMapping("/addMoney/{id}/{value}")
    public double addMoney(@PathVariable long id,@PathVariable double value){
        return service.addMoney(id,value);
    }
    @PutMapping("/removeMoney/{id}/{value}")
    public double removeMoney(@PathVariable long id,@PathVariable double value){
        return service.removeMoney(id,value);
    }
}
