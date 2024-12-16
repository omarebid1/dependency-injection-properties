import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Define the container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Vehicle car = (Vehicle) container.getBean("carBean");
        car.save();

        Vehicle plane = (Vehicle) container.getBean("planeBean");
        plane.save();

        ((ClassPathXmlApplicationContext) container).close();
    }
}
