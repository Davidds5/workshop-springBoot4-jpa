package com.educandoWeb.course.resources;

import com.educandoWeb.course.entities.Category;
import com.educandoWeb.course.services.CategoryServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("NullableProblems")
@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @Autowired
    public CategoryServices categoryServices;


    @GetMapping
    public ResponseEntity<List<Category>>findAll(){
        List<Category> list = categoryServices.findAll();
        return ResponseEntity.ok().body(list );

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = categoryServices.findByld(id);
        return ResponseEntity.ok().body(obj);

    }

}
