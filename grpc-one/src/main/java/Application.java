import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Logger;

public class Application {

  private static final Logger logger = Logger.getLogger(Application.class.getName());

  public static void main(String[] args) throws InterruptedException, IOException {
    Server server = ServerBuilder.forPort(8080).addService(new PersonService()).build();
    server.start();
    logger.info("Server started on " + server.getPort());
    server.awaitTermination();
  }

}
