package com.kavas.financeweb.service;

import com.kavas.financeweb.model.User;
import com.kavas.financeweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(Long id,User updateUser){
        updateUser.setId(id);
        return userRepository.save(updateUser);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
