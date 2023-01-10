package org.example.client.impl;

import generated.Message;
import generated.personGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.client.TestGrpcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestGrpcClientImpl implements TestGrpcClient {
    @Value("${grpc.test.hostname}")
    private String testHost;

    @Value("${grpc.test.port}")
    private int testPort;

    @Override
    public Message seeGeneratedMessage(Message messageRequest) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(testHost, testPort)
                .usePlaintext()
                .build();
        personGrpc.personBlockingStub stub
                = personGrpc.newBlockingStub(channel);
        Message messageResponse = stub
                .greet(messageRequest);
        channel.shutdown();
        return messageResponse;
    }

}
