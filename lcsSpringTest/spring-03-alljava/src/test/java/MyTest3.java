import com.lcs.config.LcsConfig;
import com.lcs.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LcsConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
