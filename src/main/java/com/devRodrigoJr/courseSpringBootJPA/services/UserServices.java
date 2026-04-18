package com.devRodrigoJr.courseSpringBootJPA.services;

import com.devRodrigoJr.courseSpringBootJPA.entities.User;
import com.devRodrigoJr.courseSpringBootJPA.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
