import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW.getMessage());
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW2.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessage());

        System.out.println(beanHW == beanHW2);
        System.out.println(beanCat == beanCat2);
    }
}