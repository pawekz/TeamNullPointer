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

    //test
    @GetMapping("/print")
    public String print() {
        return "Account Controller";
    }
    //CREATE
    @PostMapping("/postaccountrecord")
    public AccountEntity postAccountRecord(@RequestBody AccountEntity account) {
        return accountService.postAccountRecord(account);
    }
    //READ ALL
    @GetMapping("/getaccountrecords")
    public Iterable<AccountEntity> getAccountRecords() {
        return accountService.getAccountRecords();
    }
    //UPDATE
    @PutMapping("/updateaccountrecord")
    public AccountEntity putAccountDetails(@RequestParam int id, @RequestBody AccountEntity newAccountDetails){
        return accountService.putAccountDetails(id, newAccountDetails);
    }
    //DELETE
    @DeleteMapping("/deleteaccountdetails/{id}")
    public String deleteAccountDetails(@PathVariable int id) {
        return accountService.deleteAccount(id);
    }
}
