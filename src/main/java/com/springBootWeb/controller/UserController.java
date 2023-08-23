package com.springBootWeb.controller;

import com.springBootWeb.entities.User;
import com.springBootWeb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        List<User> list = userService.getUsers();
        if (list.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }

    @PostMapping("/adduser")
    public ResponseEntity<String> addUser(User u){
        userService.addUser(u);
        return ResponseEntity.status(HttpStatus.CREATED).body("{\"message\": \"User created\"}") ;
    }

    @DeleteMapping("/deterAllUser")
    public String deleteUser(){
        userService.deleteAllUsers();
        return "Deleted successfully";
    }


}
