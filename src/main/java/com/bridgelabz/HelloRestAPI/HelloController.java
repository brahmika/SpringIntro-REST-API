package com.bridgelabz.HelloRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // UC1 - Simple GET request
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }
}
