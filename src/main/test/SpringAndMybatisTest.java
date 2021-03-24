package test;

import com.kevin.dao.StudentDao;
import com.kevin.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAndMybatisTest {
    @Test
    public void testSpringAndMybatis() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        Student student = studentDao.findStudentById(1);
        System.out.println(student.getName());
    }
}
