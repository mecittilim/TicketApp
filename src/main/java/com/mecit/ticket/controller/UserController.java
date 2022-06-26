package com.mecit.ticket.controller;

import com.mecit.ticket.entities.User;
import com.mecit.ticket.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/user")
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping(name = "/getUsers")
    public List<User> getUsers(){
        return userService.getUserList();
    }

    @GetMapping("/getUser/{userName}")
    public User getUser(@PathVariable("userName") String userName){
        return userService.getUserByUsername(userName);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }




}
