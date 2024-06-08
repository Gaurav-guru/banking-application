package com.example.server.bank.application.repository;

import com.example.server.bank.application.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}