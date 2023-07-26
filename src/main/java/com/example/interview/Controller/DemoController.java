package com.example.interview.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private String message;

    @GetMapping(path = "/demo/v1/")
    public String sayHello(@RequestParam(name = "message") String userMsg){
        return "User says " + userMsg;
    }
}
