package WithArgs.StaticFactoryMethod;

public class ArgClientService {
    private final static ArgClientService ARGS_CLIENT_SERVICE = new ArgClientService();

    private ArgClientService() {
        System.out.println("[05] Static Factory Method(with_args): ArgClientService is created");
    }
    public static ArgClientService getNamedClientService(String name) {
        ARGS_CLIENT_SERVICE.setName(name);
        return ARGS_CLIENT_SERVICE;
    }
    private void setName(String name) {
        System.out.println("[05] Static Factory Method: setName: " + name);
    }

    public void test() {
        System.out.println("[->] Static Factory Method(with_args): NamedClientServer::test() is called");
    }

}
