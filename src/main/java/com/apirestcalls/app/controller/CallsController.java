package com.apirestcalls.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CallsController {

    //Creating GET Method
    @GetMapping("/hello")
    public String SayHello(){
        return "Hello From BridgeLabz";
    }

}
