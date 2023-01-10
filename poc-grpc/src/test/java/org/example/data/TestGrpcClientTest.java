package org.example.data;

import generated.Message;
import generated.personGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import org.example.client.impl.TestGrpcClientImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties= {"grpc.test.hostname=localhost", "grpc.test.port=8989"})
public class TestGrpcClientTest {

  @Autowired
  private TestGrpcClientImpl testGrpcClient;

  @BeforeAll
  public static void setup() {
    InternalTestServer internalTestServer = new InternalTestServer();
    internalTestServer.start();
  }

  @Test
  @DisplayName("Should call mocked server running")
  void givenTestGrpcClientTestRequestWhenRPCThenReplyWithMockServer() {
    Message result = testGrpcClient.seeGeneratedMessage(Message.newBuilder().setMessage("Test").build());
    System.out.println(result.getMessage());
    Assertions.assertTrue(result.getMessage().contains("Test"));
  }

  static class InternalTestServer extends Thread implements Runnable{

    private static final Logger logger = Logger.getLogger(InternalTestServer.class.getName());

    @Override
    public void run() {
      try {
        Server server = ServerBuilder.forPort(8989).addService(new MockPersonService()).build();
        server.start();
        logger.info("Server started on " + server.getPort());
      } catch (Exception exception) {
        exception.printStackTrace();
      }
    }
  }

  static class MockPersonService extends personGrpc.personImplBase {

    @Override
    public void greet(Message request, StreamObserver<Message> responseObserver) {
      Message response = Message.newBuilder().setMessage(String.format("Mensagem: %s - Hora atual: %s", request.getMessage(),
          LocalDateTime.now()) ).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }

  }
}
