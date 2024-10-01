package com.g2appdev.teamnullpointer.service;

import com.g2appdev.teamnullpointer.entity.AccountEntity;
import com.g2appdev.teamnullpointer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

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

    @SuppressWarnings("finally")
    public AccountEntity putAccountDetails(int id, AccountEntity newAccountDetails){
        AccountEntity account = new AccountEntity();

        try {
            account = arepo.findById(id).get();

            account.setFirstName(newAccountDetails.getFirstName());
            account.setLastName(newAccountDetails.getLastName());
            account.setProjectGroupNumber(newAccountDetails.getProjectGroupNumber());
            account.setRole(newAccountDetails.getRole());

        } catch (NoSuchElementException e) {
            throw new NameNotFoundException("Account with id " + id + " not found");
        }finally{
            return arepo.save(account);
        }
    }

    public String deleteAccount(int id){
        String msg = "";
        if (arepo.findById(id) != null){
            arepo.deleteById(id);
            msg = "Successfully deleted the account";
        }
        else{
            msg = "Account with id " + id + " not found";
        }
        return msg;
    }
}

