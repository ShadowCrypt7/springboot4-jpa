package com.devRodrigoJr.courseSpringBootJPA.services;

import com.devRodrigoJr.courseSpringBootJPA.entities.User;
import com.devRodrigoJr.courseSpringBootJPA.repositories.UserRepository;
import com.devRodrigoJr.courseSpringBootJPA.services.exceptions.DataBaseException;
import com.devRodrigoJr.courseSpringBootJPA.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException(e.getMessage());
        }

    }

    public User update(Long id, User obj) {
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, obj);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }


    }

    private void updateData(User entity, User obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setTelefone(obj.getTelefone());
    }

}
