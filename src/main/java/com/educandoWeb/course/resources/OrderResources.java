package com.educandoWeb.course.resources;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.services.OrderService;
import com.educandoWeb.course.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    public OrderService services;


    @SuppressWarnings("NullableProblems")
    @GetMapping
    public ResponseEntity<List<Order>>findAll(){
        List<Order> list = services.findAll();
        return ResponseEntity.ok().body(list );

    }
    @SuppressWarnings("NullableProblems")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = services.findById(id);
        return ResponseEntity.ok().body(obj);

    }

}
