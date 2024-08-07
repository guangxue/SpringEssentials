import annotation.AnyClass;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void TestAnnotation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringAnnotationBased.xml");
        AnyClass anyClassInst = context.getBean("anyClass", AnyClass.class);
        anyClassInst.anyMethod();
    }
}
