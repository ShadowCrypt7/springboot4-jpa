package com.devRodrigoJr.courseSpringBootJPA.repositories;

import com.devRodrigoJr.courseSpringBootJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
