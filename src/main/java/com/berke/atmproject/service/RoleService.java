package com.berke.atmproject.service;

import com.berke.atmproject.dto.RoleDto;
import com.berke.atmproject.dto.RoleMapper;
import com.berke.atmproject.model.Role;
import com.berke.atmproject.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleService(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    public List<RoleDto> findAllRoles(){
        return roleRepository.findAll().stream().map(role -> roleMapper.roleToRoleDto(role)).collect(Collectors.toList());
    }

    public RoleDto addRole(RoleDto roleDto){
        Role roleToSave = roleMapper.roleDtoToRole(roleDto);
        roleRepository.save(roleToSave);
        return roleDto;
    }
}
