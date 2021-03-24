package test;

import com.kevin.pojo.Student;
import com.kevin.pojo.Teacher;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    ApplicationContext applicationContext;

    @Before
    public void test() {
         applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSpring() {
        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1.getName() + student1.getAge());
    }

    @Test
    public void testFactory() {
        Student student1 = (Student) applicationContext.getBean("getStudent1");
        System.out.println(student1.getName()+student1.getAge());
    }
    @Test
    public void testAnnotation(){
        Teacher t1 = (Teacher) applicationContext.getBean("teacher");
        Teacher t2 = (Teacher) applicationContext.getBean("teacher");
        System.out.println(t1.getName()+t1.getAge());
        System.out.println(t1 ==t2);
    }
}
