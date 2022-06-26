package com.berke.atmproject.service;

import com.berke.atmproject.dto.UserDto;
import com.berke.atmproject.dto.UserMapper;
import com.berke.atmproject.model.User;
import com.berke.atmproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDto> findAllUsers(){
        return userRepository.findAll().stream().map(user -> userMapper.userToUserDto(user)).collect(Collectors.toList());
    }

    public UserDto addUser(UserDto userDto){
        User userToSave = userMapper.userDtoToUser(userDto);
        userRepository.save(userToSave);
        return userDto;
    }

    public UserDto findUserById(int id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return userMapper.userToUserDto(user.get());
        }
        else{
            return null;
        }
    }
}
