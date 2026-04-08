package com.devRodrigoJr.courseSpringBootJPA.repositories;

import com.devRodrigoJr.courseSpringBootJPA.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
