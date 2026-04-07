package com.devRodrigoJr.courseSpringBootJPA.services;

import com.devRodrigoJr.courseSpringBootJPA.entities.Product;
import com.devRodrigoJr.courseSpringBootJPA.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

}
