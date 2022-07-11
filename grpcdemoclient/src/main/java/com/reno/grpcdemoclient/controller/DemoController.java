package com.reno.grpcdemoclient.controller;


import com.reno.grpcdemoclient.service.GrpcService;
import com.reno.grpcdemoclient.service.RestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final GrpcService grpcService;
    private final RestService restService;

    public DemoController(GrpcService grpcService, RestService restService) {
        this.grpcService = grpcService;
        this.restService = restService;
    }

    @GetMapping("/hello-grpc")
    public String getGrpcMessage(@RequestParam(value = "message",
            defaultValue = "Default GRPC message") String message,
                                 @RequestParam(value = "times",
            defaultValue = "1") int times) {
        long start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            grpcService.receiveMessage(message);
        }
        long end = System.nanoTime();
        String measurement = times + " request done in: " + TimeUnit.NANOSECONDS.toMillis(end - start) + " ms";
        System.out.println(measurement);
        return measurement;
    }

    @GetMapping("/hello-rest")
    public String getRestMessage(@RequestParam(value = "message",
            defaultValue = "Default GRPC message") String message,
                                 @RequestParam(value = "times",
            defaultValue = "1") int times) {
        long start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            restService.receiveMessage(message);
        }
        long end = System.nanoTime();
        String measurement = times + " request done in: " + TimeUnit.NANOSECONDS.toMillis(end - start) + " ms";
        System.out.println(measurement);
        return measurement;
    }
}
