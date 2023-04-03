package com.project.backend.controller;

import com.project.backend.model.User;
import com.project.backend.repository.UserRepository;
import com.project.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //test world
    @GetMapping(value = "/")
    public String helloworld(){
        return "Hello World";
    }

    //REST API
    //create User - POST
    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return user1;
    }

    //read users - GET
    @GetMapping(value = "/users")
    @ResponseBody
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //read User by ID - GET
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserByid(id);
    }

    //update User - PUT
    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user, @PathVariable("id") Long id){
        return userService.updateUser(user, id);
    }

    //delete User - DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "User Deleted Successfully";
    }
}
