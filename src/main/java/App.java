import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanOne = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =  (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(beanOne.getMessage());
        System.out.println(beanOne.equals(beanTwo));

        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");

        System.out.println(catOne.getMeow());
        System.out.println(catOne.equals(catTwo));

    }
}