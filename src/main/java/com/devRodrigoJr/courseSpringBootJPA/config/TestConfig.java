package com.devRodrigoJr.courseSpringBootJPA.config;

import com.devRodrigoJr.courseSpringBootJPA.entities.User;
import com.devRodrigoJr.courseSpringBootJPA.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Batman", "batmail@gmail.com", "777", "123456");
        User u2 = new User(null, "Robin", "robb@gmail.com", "999", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
