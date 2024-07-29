import WithArgs.Constructor.ArgObject;
import WithArgs.FactoryMethod.ArgLoginService;
import WithArgs.FactoryMethod.ArgUserService;
import WithArgs.StaticFactoryMethod.ArgClientService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import NoArgs.FactoryMethod.LoginService;
import NoArgs.FactoryMethod.UserService;
import NoArgs.Constructor.EmptyObject;
import NoArgs.StaticFactoryMethod.ClientService;


public class SpringIocTest {

    private final ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("springIoc.xml");

    @Test
    public void NoArgsConstructorTest() {
        EmptyObject emptyObject = beans.getBean("emptyObject", EmptyObject.class);
        emptyObject.test();
    }

    @Test
    public void StaticFactoryMethodTest() {
        ClientService clientService = beans.getBean("clientService", ClientService.class);
        clientService.test();
    }

    @Test
    public void FactoryMethodTest() {
        UserService userService = beans.getBean("userService", UserService.class);
        LoginService loginService = beans.getBean("loginService", LoginService.class);
        userService.test();
        loginService.test();
    }

    @Test
    public void WithArgsConstructorTest() {
        ArgObject argObject = beans.getBean("namedObject", ArgObject.class);
        argObject.test();
    }

    @Test
    public void WithArgsStaticFactoryMethodTest() {
        ArgClientService argClientService = beans.getBean("namedClientService", ArgClientService.class);
        argClientService.test();
    }

    @Test
    public void WithArgsFactoryMethodTest() {
        ArgUserService  argUserService = beans.getBean("argUserService", ArgUserService.class);
        argUserService.test();

        ArgLoginService argLoginService = beans.getBean("argLoginService", ArgLoginService.class);
        argLoginService.test();
    }

}
