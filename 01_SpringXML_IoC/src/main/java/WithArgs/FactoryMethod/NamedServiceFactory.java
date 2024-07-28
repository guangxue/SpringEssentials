package WithArgs.FactoryMethod;
import NoArgs.FactoryMethod.LoginService;
import NoArgs.FactoryMethod.Service;
import NoArgs.FactoryMethod.UserService;

public class NamedServiceFactory {

   private LoginService loginService = new LoginService();
   private UserService userService = new UserService();

    public void NamedServiceFactory(String name) {
        System.out.println("[05] NamedServiceFactory: " + name);
    }

    public Service getServiceInstance(String name) {
        if (name.equalsIgnoreCase("user")) {
            return userService;
        }
        if (name.equalsIgnoreCase("login")) {
            return loginService;
        }
        return null;
    }

}
