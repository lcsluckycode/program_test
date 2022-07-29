import com.lcs.demo4.service.UserService;
import com.lcs.demo4.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserServiceImpl) context.getBean("userService");

        userService.add();
    }
}
