import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(helloBean==helloBean2);

        Cat cat = (Cat) applicationContext.getBean("catBean");
        Cat cat2 = (Cat) applicationContext.getBean("catBean");

        System.out.println(cat==cat2);
    }
}