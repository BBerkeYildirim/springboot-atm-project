package com.berke.atmproject.api;

import com.berke.atmproject.dto.UserDto;
import com.berke.atmproject.model.User;
import com.berke.atmproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<UserDto> findAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping
    public UserDto addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable int id){
        return userService.findUserById(id);
    }
}
