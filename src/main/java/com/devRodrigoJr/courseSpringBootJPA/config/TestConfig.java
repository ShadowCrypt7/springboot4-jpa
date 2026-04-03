package com.devRodrigoJr.courseSpringBootJPA.config;

import com.devRodrigoJr.courseSpringBootJPA.entities.Category;
import com.devRodrigoJr.courseSpringBootJPA.entities.Order;
import com.devRodrigoJr.courseSpringBootJPA.entities.User;
import com.devRodrigoJr.courseSpringBootJPA.entities.enums.OrderStatus;
import com.devRodrigoJr.courseSpringBootJPA.repositories.CategoryRepository;
import com.devRodrigoJr.courseSpringBootJPA.repositories.OrderRepository;
import com.devRodrigoJr.courseSpringBootJPA.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Batman", "batmail@gmail.com", "777", "123456");
        User u2 = new User(null, "Robin", "robb@gmail.com", "999", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.WAITING_PAYMMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
