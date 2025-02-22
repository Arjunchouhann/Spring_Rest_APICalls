package com.apirestcalls.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CallsController {

    //Creating GET Method
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello From BridgeLabz";
    }

    //Create GET request method & pass name as query
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name + " From BridgeLabz";
    }

    //Creating GET request method & pass name as path variable
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello "+name+" from BridgeLabz";
    }
}
