package NoArgs.FactoryMethod;

public class ServiceFactory {
    private ServiceFactory() {
        System.out.println("[03] Factory Method: ServiceFactory is created");
    }
    public UserService createUserService() {
        return new UserService();
    }
    public LoginService createLoginService() {
        return new LoginService();
    }
    public void test() {
        System.out.println("[->] ServiceFactory::test() is called");
    }
}
