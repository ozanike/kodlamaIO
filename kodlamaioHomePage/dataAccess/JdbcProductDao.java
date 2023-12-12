package kodlamaioHomePage.dataAccess;

import kodlamaioHomePage.entites.Course;

public class JdbcProductDao implements CourseDao {
    public void add(Course course) {
        System.out.println(course.getCourseName() +" JDBC ile database eklendi");

    }
}
