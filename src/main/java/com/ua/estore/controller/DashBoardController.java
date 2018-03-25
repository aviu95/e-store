package com.ua.estore.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashBoardController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String welcomePage(){
        return "Welcome to E-store";
    }
}
