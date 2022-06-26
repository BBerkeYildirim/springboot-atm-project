package com.berke.atmproject.api;

import com.berke.atmproject.dto.AccountDto;
import com.berke.atmproject.model.Account;
import com.berke.atmproject.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountDto> findAllAccounts(){
        return accountService.findAllAccounts();
    }

    @PostMapping
    public AccountDto addAccount(@Valid @RequestBody AccountDto accountDto){
        return accountService.addAccount(accountDto);
    }
}
