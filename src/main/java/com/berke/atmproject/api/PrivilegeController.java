package com.berke.atmproject.api;

import com.berke.atmproject.model.Privilege;
import com.berke.atmproject.service.PrivilegeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/privileges")
public class PrivilegeController {

    private final PrivilegeService privilegeService;

    public PrivilegeController(PrivilegeService privilegeService) {
        this.privilegeService = privilegeService;
    }

    @GetMapping
    public List<Privilege> findAllPrivileges(){
        return privilegeService.findAllPrivileges();
    }

    @PostMapping
    public Privilege addPrivilege(@RequestBody Privilege privilege){
        return privilegeService.addPrivilege(privilege);
    }
}
