package NoArgs.FactoryMethod;

public class UserService implements Service {
    public UserService() {
        System.out.println("[03] UserService is created.");
    }

    public void test() {
        System.out.println("[->] UserService::test() is called.");
    }
}
