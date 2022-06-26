package com.berke.atmproject.dto;

import com.berke.atmproject.model.Privilege;

import javax.validation.constraints.NotBlank;
import java.util.Collection;

public class RoleDto {


    private int id;
    @NotBlank
    private String name;

    private Collection<PrivilegeDto> privileges;

    public RoleDto(int id, String name, Collection<PrivilegeDto> privileges) {
        this.id = id;
        this.name = name;
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


    public Collection<PrivilegeDto> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Collection<PrivilegeDto> privileges) {
        this.privileges = privileges;
    }
}
