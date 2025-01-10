package com.scm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
