package WithArgs.FactoryMethod;

public class ArgLoginService {
    private final String loginName;
    ArgLoginService(String loginName) {
        this.loginName = loginName;
    }
    public void test() {
        System.out.printf("Hello %s! from ArgLoginService%n", loginName);
    }
}
