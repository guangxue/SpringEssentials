import NoArgs.FactoryMethod.LoginService;
import NoArgs.FactoryMethod.UserService;
import NoArgs.Constructor.EmptyObject;
import NoArgs.StaticFactoryMethod.ClientService;
import WithArgs.Constructor.NamedObject;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    private ClassPathXmlApplicationContext beans= new ClassPathXmlApplicationContext("springIoc.xml");

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
        NamedObject namedObject = beans.getBean("namedObject", NamedObject.class);
        namedObject.test();
    }

}
