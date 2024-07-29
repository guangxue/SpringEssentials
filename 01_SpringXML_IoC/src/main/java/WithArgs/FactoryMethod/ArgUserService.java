package WithArgs.FactoryMethod;

public class ArgUserService {
    private final String username;
    public ArgUserService(String username) {
        this.username = username;
    }

    public void test() {
        System.out.printf("Hello %s! from ArgUserService%n", username);
    }
}
