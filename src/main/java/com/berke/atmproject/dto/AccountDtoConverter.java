package com.berke.atmproject.dto;

import com.berke.atmproject.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDtoConverter {

    public AccountDto convertToAccountDto(Account account){
        return new AccountDto(account.getType(), account.getBalance(), account.getUser());
    }

    public Account convertToAccount(AccountDto accountDto){
        Account account = new Account();
        account.setBalance(accountDto.getBalance());
        account.setType(accountDto.getType());
        account.setUser(accountDto.getUser());
        return account;
    }
}
