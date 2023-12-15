package com.Natwest.Accountservice.controller;

import com.Natwest.Accountservice.model.Account;
import com.Natwest.Accountservice.service.Accountservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@Slf4j
public class Accountcontroller {

    @Autowired
    private Accountservice accountService;

    @PostMapping("/")
    public Account saveAccount( @RequestBody Account account) {
        log.info("Inside saveAccount method of Accountcontroller");
        return accountService.saveAccount(account);
    }
    @GetMapping("/{id}")
    public Account findAccountById(@PathVariable("id") Long accountId) {
        log.info("Inside findAccountById method of Accountcontroller");
        return accountService.findAccountById(accountId);
    }
}
