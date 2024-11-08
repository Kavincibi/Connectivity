package com.example.connectivity.services;

import com.example.connectivity.model.User;
import com.example.connectivity.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservices {

    @Autowired
    private Userrepository repository;

    public List<User> get() {
       return repository.findAll();
    }

    public String post(User user) {
        repository.save(user);
        return "Details updated..";
    }

    public String put(User user) {
        repository.save(user);
        return "Details updated";
    }

    public String delete(int id) {
        repository.deleteById(id);
        return "File deleted..";
    }

}
