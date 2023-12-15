package com.Natwest.Accountservice.service;

import com.Natwest.Accountservice.model.Account;
import com.Natwest.Accountservice.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Accountservice {
    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        log.info("Inside saveAccount method of Accountservice");
        return accountRepository.save(account);
    }

    public Account findAccountById(Long accountId) {
        log.info("Inside findAccountById method of Accountservice");
        return accountRepository.findByAccountId(accountId);
    }

    }

