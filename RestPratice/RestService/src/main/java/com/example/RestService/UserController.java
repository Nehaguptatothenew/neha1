package com.example.RestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDaoService userDaoService;
    @GetMapping("/user/all")
    public List<User> getAllUser()
    {
        return userDaoService.findAll();
    }
    @GetMapping("/user/{id}")
    public User getById(@PathVariable int id)
    {
        return userDaoService.findOne(id);
    }
    @GetMapping("/user")
    public User insertUser(@RequestBody User user)
    {
         userDaoService.saveUser(user);
         return user;
    }


}
