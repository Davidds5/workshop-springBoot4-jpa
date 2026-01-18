package com.educandoWeb.course.services;

import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByIld(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();

    }

}
