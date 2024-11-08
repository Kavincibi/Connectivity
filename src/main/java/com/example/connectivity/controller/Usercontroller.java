package com.example.connectivity.controller;


import com.example.connectivity.model.User;
import com.example.connectivity.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Usercontroller {

    @Autowired
    private Userservices services;

    @GetMapping("get")
    private List<User> user(){
        return services.get();
    }

    @PostMapping("post")
    private String post(@RequestBody User user){
        return services.post(user);
    }

    @PutMapping("put")
    private String put(@RequestBody User user,@RequestParam int id){
        user.setId(id);
        return services.put(user);
    }
    

    @DeleteMapping("delete")
    private String delete(@RequestParam int id){
        return services.delete(id);
    }
}
