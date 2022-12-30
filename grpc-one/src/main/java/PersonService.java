import generated.Empty;
import generated.Message;
import generated.personGrpc;
import io.grpc.stub.StreamObserver;

public class PersonService extends personGrpc.personImplBase {

  @Override
  public void greet(Message request, StreamObserver<Empty> responseObserver) {
    System.out.println(request.getMessage());
  }
}
