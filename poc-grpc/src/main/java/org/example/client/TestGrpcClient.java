package org.example.client;


import generated.Message;

public interface TestGrpcClient {
    public Message seeGeneratedMessage(Message messageRequest);
}
