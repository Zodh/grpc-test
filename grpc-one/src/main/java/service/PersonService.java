package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import generated.Message;
import generated.personGrpc;
import io.grpc.stub.StreamObserver;
import java.time.LocalDateTime;

public class PersonService extends personGrpc.personImplBase {

  private static final Logger log = LoggerFactory.getLogger(PersonService.class);

  @Override
  public void greet(Message request, StreamObserver<Message> responseObserver) {
    Message response = Message.newBuilder().setMessage(String.format("Mensagem: %s - Hora atual: %s", request.getMessage(),
        LocalDateTime.now()) ).build();
    System.out.println("Requisicao recebida: " + response.getMessage());
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
