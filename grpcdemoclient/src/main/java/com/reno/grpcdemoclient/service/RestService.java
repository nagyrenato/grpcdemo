package com.reno.grpcdemoclient.service;

import com.reno.grpcdemoclient.model.SimpleRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Service
public class RestService {

    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(3);

    private final WebClient webClient;

    public RestService(WebClient webClient) {
        this.webClient = webClient;
    }

    public String receiveMessage(String message) {
        SimpleRequest simpleRequest = new SimpleRequest();
        simpleRequest.setMessage(message);

        return webClient
                .post()
                .uri("localhost:8081/api/hello-rest-server")
                .body(BodyInserters.fromValue(simpleRequest))
                .retrieve()
                .bodyToMono(String.class)
                .block(REQUEST_TIMEOUT);
    }
}
