package com.example.BankManagementApp.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String account_holder_name;
    @Column
    private double account_balance;
    Account(){

    }

    public Account(String account_holder_name, double account_balance) {
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }
    public String getAccount_holder_name() {
        return this.account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public double getAccount_balance() {
        return this.account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account_holder_name='" + account_holder_name + '\'' +
                ", account_balance=" + account_balance +
                '}';
    }
}

