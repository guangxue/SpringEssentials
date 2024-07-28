package NoArgs.FactoryMethod;

public class LoginService implements Service {
    public LoginService() {
        System.out.println("[03] LoginService is created.");
    }
    public void test() {
        System.out.println("[->] LoginService::test() is called.");
    }
}
