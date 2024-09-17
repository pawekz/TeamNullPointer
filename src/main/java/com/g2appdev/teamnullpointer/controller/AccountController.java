package com.g2appdev.teamnullpointer.controller;

import com.g2appdev.teamnullpointer.entity.AccountEntity;
import com.g2appdev.teamnullpointer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/print")
    public String print() {
        return "Account Controller";
    }

    @GetMapping("/getaccountrecords")
    public Iterable<AccountEntity> getAccountRecords() {
        return accountService.getAccountRecords();
    }

    @PostMapping("/postaccountrecord")
    public AccountEntity postAccountRecord(@RequestBody AccountEntity account) {
        return accountService.postAccountRecord(account);
    }
}
