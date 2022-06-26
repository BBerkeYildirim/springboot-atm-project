package com.berke.atmproject.api;

import com.berke.atmproject.dto.RoleDto;
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
    public List<RoleDto> findAllRoles(){
        return roleService.findAllRoles();
    }

    @PostMapping
    public RoleDto addRole(@RequestBody RoleDto roleDto){
        return roleService.addRole(roleDto);
    }
}
