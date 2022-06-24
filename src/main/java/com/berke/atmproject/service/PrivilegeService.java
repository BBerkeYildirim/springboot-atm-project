package com.berke.atmproject.service;

import com.berke.atmproject.model.Privilege;
import com.berke.atmproject.repository.PrivilegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService {


    private final PrivilegeRepository privilegeRepository;

    public PrivilegeService(PrivilegeRepository privilegeRepository) {
        this.privilegeRepository = privilegeRepository;
    }

    public List<Privilege> findAllPrivileges(){
       return privilegeRepository.findAll();
    }

    public Privilege addPrivilege(Privilege privilege){
        return privilegeRepository.save(privilege);
    }
}
