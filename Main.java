import kodlamaioHomePage.business.CourseManager;
import kodlamaioHomePage.core.logging.BaseLogger;
import kodlamaioHomePage.core.logging.DatabaseLogger;
import kodlamaioHomePage.core.logging.EmailLogger;
import kodlamaioHomePage.core.logging.FileLogger;
import kodlamaioHomePage.dataAccess.HibernateProductDao;
import kodlamaioHomePage.entites.Course;

public class Main {
    public static void main(String[] args) throws Exception {

        BaseLogger[] loggers = new BaseLogger[]{
                new EmailLogger(),new FileLogger(),new DatabaseLogger()
        };

        Course course1 = new Course("Java 101","Java",1000);
        Course course2 = new Course("JavaScript 101","Javascript",1200);
        Course course3 = new Course("Java 101","Java",10);

        CourseManager courseManager = new CourseManager(new HibernateProductDao(),loggers);
        courseManager.add(course1,loggers);
        courseManager.add(course2,loggers);
        courseManager.add(course3,loggers);




    }
}