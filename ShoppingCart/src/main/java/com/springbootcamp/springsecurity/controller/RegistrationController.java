package com.springbootcamp.springsecurity.controller;


import com.springbootcamp.springsecurity.dtos.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class RegistrationController {

    @GetMapping("/user/registration")
    public String showRegistrationForm(WebRequest webRequest, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }
}
