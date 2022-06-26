package com.berke.atmproject.dto;

import com.berke.atmproject.model.Privilege;
import java.util.Collection;

public class RoleDto {


    private int id;
    private String name;
    private Collection<UserDto> users;
    private Collection<PrivilegeDto> privileges;

    public RoleDto(int id, String name, Collection<UserDto> users, Collection<PrivilegeDto> privileges) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.privileges = privileges;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<UserDto> getUsers() {
        return users;
    }

    public void setUsers(Collection<UserDto> users) {
        this.users = users;
    }

    public Collection<PrivilegeDto> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Collection<PrivilegeDto> privileges) {
        this.privileges = privileges;
    }
}
