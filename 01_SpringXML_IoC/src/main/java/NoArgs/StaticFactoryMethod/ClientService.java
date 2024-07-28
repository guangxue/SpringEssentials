package NoArgs.StaticFactoryMethod;

public class ClientService {
    private static final ClientService clientService = new ClientService();
    private ClientService() {
        System.out.println("[02] ClientService is created.");
    }

    public static ClientService getInstance() {
        return clientService;
    }
    public void test() {
        System.out.println("[->] ClientService::test() method called.");
    }
}
