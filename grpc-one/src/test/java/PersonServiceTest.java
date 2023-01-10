import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.typed.ActorSystem;
import generated.personGrpc;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import service.PersonService;

public class PersonServiceTest {

  @ClassRule
  public static final TestKitJunitResource testKit = new TestKitJunitResource();

  private static ActorSystem<?> system = testKit.system();
  private static PersonService service;

  @BeforeClass
  public static void setup() {
    service = new PersonService();
  }
}
