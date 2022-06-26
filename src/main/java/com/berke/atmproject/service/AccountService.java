package com.berke.atmproject.service;

import com.berke.atmproject.model.Account;
import com.berke.atmproject.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public List<Account> findAllAccounts(){
        return accountRepository.findAll();
    }

    public Account addAccount(Account account) {
        accountRepository.save(account);
        return account;
    }
}
