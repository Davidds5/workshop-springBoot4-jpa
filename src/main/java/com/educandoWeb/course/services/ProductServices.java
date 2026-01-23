package com.educandoWeb.course.services;

import com.educandoWeb.course.entities.Product;
import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.repositories.ProductRepository;
import com.educandoWeb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findByld(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();

    }

}
