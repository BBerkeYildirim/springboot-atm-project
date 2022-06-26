package com.berke.atmproject.dto;

import com.berke.atmproject.model.User;

public class AccountDto {


    private int id;
    private String type;
    private double balance;
    private UserDto user;

    public AccountDto(int id, String type, double balance, UserDto user) {
        this.id = id;
        this.type = type;
        this.balance = balance;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
