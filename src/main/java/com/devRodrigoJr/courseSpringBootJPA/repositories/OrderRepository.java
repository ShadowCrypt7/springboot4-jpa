package com.devRodrigoJr.courseSpringBootJPA.repositories;

import com.devRodrigoJr.courseSpringBootJPA.entities.Order;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<@NonNull Order, Long> {

}
