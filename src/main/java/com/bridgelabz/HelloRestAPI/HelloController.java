package com.bridgelabz.HelloRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // UC1 - Simple GET
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    // UC2 - GET with Query Parameter
    @GetMapping("/hello/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3 - GET with Path Variable
    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC4 - POST with Request Body
    @PostMapping("/hello/post")
    public String helloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " "
                + user.getLastName() + " from BridgeLabz";
    }

    // UC5 - PUT with Path Variable and Query Parameter
    @PutMapping("/hello/put/{firstName}")
    public String helloPut(@PathVariable String firstName,
                           @RequestParam String lastName) {
        return "Hello " + firstName + " "
                + lastName + " from BridgeLabz";
    }
}