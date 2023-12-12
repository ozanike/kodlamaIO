package kodlamaioHomePage.dataAccess;

import kodlamaioHomePage.entites.Course;

public class HibernateProductDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() +" Hibernate ile database eklendi");

    }
}
