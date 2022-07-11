package com.reno.restdemoserver.controller;


import com.reno.restdemoserver.model.SimpleRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @PostMapping("/hello-rest-server")
    public String getRestMessage(@RequestBody SimpleRequest simpleRequest) {
        String message = simpleRequest.getMessage();
        return "Received your message: " + message + "";
    }
}
