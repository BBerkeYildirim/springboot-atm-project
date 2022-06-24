package com.berke.atmproject.service;

import com.berke.atmproject.model.Role;
import com.berke.atmproject.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> findAllRoles(){
        return roleRepository.findAll();
    }

    public Role addRole(Role role){
        return roleRepository.save(role);
    }
}
