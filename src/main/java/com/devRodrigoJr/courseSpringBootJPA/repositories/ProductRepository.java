package com.devRodrigoJr.courseSpringBootJPA.repositories;

import com.devRodrigoJr.courseSpringBootJPA.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
