package com.bridgelabz.HelloRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
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
}
