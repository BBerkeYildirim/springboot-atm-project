package com.berke.atmproject.service;

import com.berke.atmproject.dto.AccountDto;
import com.berke.atmproject.dto.AccountMapper;
import com.berke.atmproject.model.Account;
import com.berke.atmproject.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountService(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }


    public List<AccountDto> findAllAccounts(){
        return accountRepository.findAll().stream().map(account -> accountMapper.accountToAccountDto(account))
                .collect(Collectors.toList());
    }

    public AccountDto addAccount(AccountDto accountDto) {
        Account accountToSave = accountMapper.accountDtoToAccount(accountDto);
        accountRepository.save(accountToSave);
        return accountDto;
    }
}
