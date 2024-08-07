package NoArgs.FactoryMethod;

public class LoginService {
    public LoginService() {
        System.out.println("[03] Factory Method: LoginService is created.");
    }
    public void test() {
        System.out.println("[->] LoginService::test() is called.");
    }
}
