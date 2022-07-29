import com.lcs.pojo.Student;
import com.lcs.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("users.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
