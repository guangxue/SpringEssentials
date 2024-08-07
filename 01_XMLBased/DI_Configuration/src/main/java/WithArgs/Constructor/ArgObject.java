package WithArgs.Constructor;

public class ArgObject {
    private final String name;

    public ArgObject(String name) {
        this.name = name;
        System.out.println("[04] ArgObject(with_args) is created");
    }
    public void test() {
        System.out.printf("[->] ArgObject<%s>::test() is called%n", name);
    }
}
