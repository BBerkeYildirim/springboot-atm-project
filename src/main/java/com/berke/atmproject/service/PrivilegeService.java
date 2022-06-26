package com.berke.atmproject.service;

import com.berke.atmproject.dto.PrivilegeDto;
import com.berke.atmproject.dto.PrivilegeMapper;
import com.berke.atmproject.model.Privilege;
import com.berke.atmproject.repository.PrivilegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrivilegeService {


    private final PrivilegeRepository privilegeRepository;
    private final PrivilegeMapper privilegeMapper;

    public PrivilegeService(PrivilegeRepository privilegeRepository, PrivilegeMapper privilegeMapper) {
        this.privilegeRepository = privilegeRepository;
        this.privilegeMapper = privilegeMapper;
    }

    public List<PrivilegeDto> findAllPrivileges(){
       return privilegeRepository.findAll().stream()
               .map(privilege -> privilegeMapper.privilegeToPrivilegeDto(privilege)).collect(Collectors.toList());
    }

    public PrivilegeDto addPrivilege(PrivilegeDto privilegeDto){
        Privilege privilegeToSave = privilegeMapper.privilegeDtoToPrivilege(privilegeDto);
        privilegeRepository.save(privilegeToSave);
        return privilegeDto;
    }
}
