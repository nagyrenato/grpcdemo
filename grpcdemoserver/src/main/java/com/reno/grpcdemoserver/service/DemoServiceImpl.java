package com.reno.grpcdemoserver.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import com.reno.grpc.*;

@GrpcService
public class DemoServiceImpl extends SimpleServiceGrpc.SimpleServiceImplBase {

    @Override
    public void getRequest(SimpleRequest request, StreamObserver<SimpleResponse> responseObserver) {
        String message = request.getMessage();

        SimpleResponse simpleResponse = SimpleResponse.newBuilder()
                .setMessage("Received your message: " + message + "")
                .build();

        responseObserver.onNext(simpleResponse);
        responseObserver.onCompleted();
    }
}