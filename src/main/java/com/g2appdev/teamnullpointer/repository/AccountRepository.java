package com.g2appdev.teamnullpointer.repository;

import com.g2appdev.teamnullpointer.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <AccountEntity, Integer>{
    public AccountEntity findByLastName(String lastName);
}
