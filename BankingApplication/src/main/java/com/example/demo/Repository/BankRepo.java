package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Account;

public interface BankRepo extends JpaRepository<Account, Integer>{

}
