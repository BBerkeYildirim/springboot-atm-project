package com.berke.atmproject.service;

import com.berke.atmproject.model.User;
import com.berke.atmproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User findUserById(int id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }

        else{
            return null;
        }
    }
}
