package com.berke.atmproject.dto;

import com.berke.atmproject.model.User;

public class AccountDto {

    //Dtolar baştan yapılacak
    private String type;
    private double balance;
    private User user;

    public AccountDto(String type, double balance, User user) {
        this.type = type;
        this.balance = balance;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
