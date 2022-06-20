package com.justin.RESTAPI.Java.REST.API.Controllers;

import com.justin.RESTAPI.Java.REST.API.Models.User;
import com.justin.RESTAPI.Java.REST.API.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMain(){ return "Hello main!"; }

//add user to db
    @PostMapping(value = "/adduser")
    public User addUser(@RequestBody User user) {
        User newUser = userRepo.save(user);
    return newUser;
    }

//    TODO find users
    @RequestMapping(value = "/users")
    public List<User> getUsers() {
        return   userRepo.findAll();
    }

//  TODO update users by id
    @PutMapping(value = "/update/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user) {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setUsername(user.getUsername());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        userRepo.save(updatedUser);
        return updatedUser;

    }

//  TODO  Delete user by id
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUserById(@PathVariable Long id) {
        userRepo.deleteById(id);
        return "User deleted successfully";
    }



}