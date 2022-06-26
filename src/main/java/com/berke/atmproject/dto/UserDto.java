package com.berke.atmproject.dto;

import com.berke.atmproject.model.Account;
import com.berke.atmproject.model.Role;

import java.util.ArrayList;
import java.util.Collection;

public class UserDto {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Collection<AccountDto> accounts;

    private Collection<RoleDto> roles;

    public UserDto(int id, String firstName, String lastName, String email, String password, Collection<AccountDto> accounts, Collection<RoleDto> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accounts = accounts;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<AccountDto> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<AccountDto> accounts) {
        this.accounts = accounts;
    }

    public Collection<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Collection<RoleDto> roles) {
        this.roles = roles;
    }
}
