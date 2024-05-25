package com.example.BankManagementApp.repository;

import com.example.BankManagementApp.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
