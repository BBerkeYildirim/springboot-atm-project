package com.berke.atmproject.api;

import com.berke.atmproject.model.Role;
import com.berke.atmproject.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> findAllRoles(){
        return roleService.findAllRoles();
    }

    @PostMapping
    public Role addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }
}
