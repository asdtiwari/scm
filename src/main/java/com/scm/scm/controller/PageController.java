package com.scm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.scm.entities.RegisterForm;
import com.scm.scm.entities.User;
import com.scm.scm.services.implementation.UserServiceImplementation;


@Controller
public class PageController {

    @RequestMapping("/index")
    public String index() {
        return "redirect:/";
    }

    @RequestMapping("/home")
    public String home() {
        return "/home";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "/contact";
    }

    @RequestMapping("/services")
    public String services() {
        return "/services";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "/signup";
    }

    @RequestMapping("/about")
    public String about() {
        return "/about";
    }

    @RequestMapping(value="/do-register", method=RequestMethod.POST)
    public String requestMethodName(@ModelAttribute RegisterForm userForm) {
        System.out.println(userForm);
        UserServiceImplementation service = new UserServiceImplementation();
        
        User user = new User();
        user.setUsername(userForm.getEmail());
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setNumber(userForm.getNumber());
        user.setAbout(userForm.getAbout());

        service.saveUser(user);
        return "redirect:/signup";
    }
    
}
