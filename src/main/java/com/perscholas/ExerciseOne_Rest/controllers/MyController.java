package com.perscholas.ExerciseOne_Rest.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {

    @RequestMapping("/login")   // either type '/' or index
    public String showlogin()
    {
        return "inboxpage";
    }
    @GetMapping
    public String simplemethod() {
        //mapped to hostname:port/home/
        return "inboxpage";
    }
    @RequestMapping("/index")
    public String showindex() {
        //mapped to hostname:port/home/index/
        return "inboxpage";
    }

}
