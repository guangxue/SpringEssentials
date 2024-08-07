package NoArgs.FactoryMethod;

public class UserService {
    public UserService() {
        System.out.println("[03] Factory Method: UserService is created.");
    }

    public void test() {
        System.out.println("[->] UserService::test() is called.");
    }
}
