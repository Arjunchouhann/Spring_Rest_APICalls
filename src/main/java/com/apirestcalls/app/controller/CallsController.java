package com.apirestcalls.app.controller;

import com.apirestcalls.app.userdto.UserDTO;
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

    //Creating POST request method
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    //Creating PUT request method
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName , @RequestParam String lastName){
        return "Hello "+ firstName + " " + lastName + " From BridgeLabz";
    }
}
