package com.berke.atmproject.dto;

import com.berke.atmproject.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {
    public UserDto convertToUserDto(User user){
        return new UserDto(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword(),
                user.getAccounts(),user.getRoles());
    }

    public User convertToUser(UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        //user.setAccounts(userDto.getAccounts());
        //user.setRoles(userDto.getRoles());
        return user;
    }
}
