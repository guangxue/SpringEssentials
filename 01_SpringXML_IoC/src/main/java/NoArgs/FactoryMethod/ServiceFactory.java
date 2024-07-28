package NoArgs.FactoryMethod;

public class ServiceFactory {
    private static final ServiceFactory serviceFactory = new ServiceFactory();
    private static final UserService userService = new UserService();
    private static final LoginService loginService = new LoginService();

    private ServiceFactory() {
        System.out.println("[03] ServiceFactory is created");
    }
    public static ServiceFactory createInstance() {
        return serviceFactory;
    }

    public UserService createUserService() {
        return userService;
    }
    public LoginService createLoginService() {
        return loginService;
    }
    public void test() {
        System.out.println("[->] ServiceFactory::test() is called");
    }
}
