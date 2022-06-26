package com.berke.atmproject.dto;

import com.berke.atmproject.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDto accountToAccountDto(Account account);

    Account accountDtoToAccount(AccountDto accountDto);
}
