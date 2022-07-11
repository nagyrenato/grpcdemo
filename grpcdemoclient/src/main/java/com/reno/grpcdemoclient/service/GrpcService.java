package com.reno.grpcdemoclient.service;

import com.reno.grpc.SimpleRequest;
import com.reno.grpc.SimpleResponse;
import com.reno.grpc.SimpleServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcService {

    @GrpcClient("grpc-server")
    private SimpleServiceGrpc.SimpleServiceBlockingStub simpleServiceStub;

    public String receiveMessage(String message) {
        SimpleRequest simpleRequest = SimpleRequest.newBuilder()
                .setMessage(message)
                .build();

        //call to grpc server
        SimpleResponse simpleResponse = simpleServiceStub.getRequest(simpleRequest);

        return simpleResponse.getMessage();
    }
}
