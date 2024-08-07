package WithArgs.FactoryMethod;


public class ArgServiceFactory {

    public ArgServiceFactory() {
        System.out.println("[06] ArgServiceFactory() is created");
    }

    public ArgUserService getArgUserService(String username) {
        return new ArgUserService(username);
    }
    public ArgLoginService getArgLoginService(String loginName) {
        return new ArgLoginService(loginName);
    }
}
