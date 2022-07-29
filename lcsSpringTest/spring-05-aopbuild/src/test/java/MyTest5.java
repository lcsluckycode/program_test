import com.lcs.service.UserService;
import com.lcs.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest5 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
