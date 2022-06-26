package com.berke.atmproject.dto;

import java.util.Collection;

public class PrivilegeDto {

    private int id;

    private String name;

    private Collection<RoleDto> roles;

    public PrivilegeDto(int id, String name, Collection<RoleDto> roles) {
        this.id = id;
        this.name = name;
        this.roles = roles;
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

    public Collection<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Collection<RoleDto> roles) {
        this.roles = roles;
    }
}
