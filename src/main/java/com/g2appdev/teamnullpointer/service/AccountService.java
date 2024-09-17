package com.g2appdev.teamnullpointer.service;

import com.g2appdev.teamnullpointer.entity.AccountEntity;
import com.g2appdev.teamnullpointer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository arepo;

    public AccountService(){
        super();
    }

    public AccountEntity postAccountRepository(AccountEntity account){
        return arepo.save(account);
    }

    public List<AccountEntity> getAllAccounts(){
        return arepo.findAll();
    }

    public AccountEntity postAccountRecord(AccountEntity account) {
        return arepo.save(account);
    }

    public List<AccountEntity> getAccountRecords() {
        return arepo.findAll();
    }
}
