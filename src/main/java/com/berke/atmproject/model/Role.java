package com.berke.atmproject.model;

import java.util.Collection;

public class Role {

    private int id;

    private String name;

    private Collection<User> users;

    private Collection<Privilege> privileges;

}
