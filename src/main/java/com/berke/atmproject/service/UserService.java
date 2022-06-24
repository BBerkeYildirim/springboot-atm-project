package com.berke.atmproject.service;

import com.berke.atmproject.dto.UserDto;
import com.berke.atmproject.dto.UserDtoConverter;
import com.berke.atmproject.model.User;
import com.berke.atmproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;

    public UserService(UserRepository userRepository, UserDtoConverter userDtoConverter) {
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
    }

    public List<UserDto> findAllUsers(){
        return userRepository.findAll().stream().map(user -> userDtoConverter.convertToUserDto(user)).collect(Collectors.toList());
    }

    public UserDto addUser(UserDto userDto){
        User user = userDtoConverter.convertToUser(userDto);
        userRepository.save(user);
        return userDto;
    }

    public UserDto findUserById(int id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return userDtoConverter.convertToUserDto(user.get());
        }

        else{
            return null;
        }
    }
}
