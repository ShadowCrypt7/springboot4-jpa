package com.devRodrigoJr.courseSpringBootJPA.resources;

import com.devRodrigoJr.courseSpringBootJPA.entities.Category;
import com.devRodrigoJr.courseSpringBootJPA.entities.Order;
import com.devRodrigoJr.courseSpringBootJPA.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResources {

    @Autowired
    private CategoryServices categoryServices;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = categoryServices.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = categoryServices.findById(id);

        return ResponseEntity.ok().body(obj);
    }

}
