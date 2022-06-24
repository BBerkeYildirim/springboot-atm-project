package com.berke.atmproject.api;

import com.berke.atmproject.model.Account;
import com.berke.atmproject.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> findAllAccounts(){
        return accountService.findAllAccounts();
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }
}
