package com.berke.atmproject.api;

import com.berke.atmproject.dto.PrivilegeDto;
import com.berke.atmproject.model.Privilege;
import com.berke.atmproject.service.PrivilegeService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/privileges")
public class PrivilegeController {

    private final PrivilegeService privilegeService;

    public PrivilegeController(PrivilegeService privilegeService) {
        this.privilegeService = privilegeService;
    }

    @GetMapping
    public List<PrivilegeDto> findAllPrivileges(){
        return privilegeService.findAllPrivileges();
    }

    @PostMapping
    public PrivilegeDto addPrivilege(@Valid @RequestBody PrivilegeDto privilegeDto){
        return privilegeService.addPrivilege(privilegeDto);
    }
}
