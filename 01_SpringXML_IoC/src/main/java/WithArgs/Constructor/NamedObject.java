package WithArgs.Constructor;
import NoArgs.FactoryMethod.LoginService;
import NoArgs.FactoryMethod.UserService;

public class NamedObject {
    private String name;
    private final LoginService loginService = new LoginService();
    private final UserService userService = new UserService();

    public NamedObject() {
        System.out.println("[05] NamedServiceFactory is created");
    }
    public void test() {
        System.out.println("[->] NamedServiceFactory::test() is called");
    }
}
