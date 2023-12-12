package kodlamaioHomePage.business;

import kodlamaioHomePage.core.logging.BaseLogger;
import kodlamaioHomePage.dataAccess.CourseDao;
import kodlamaioHomePage.entites.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] loggers;
    private List<String> courseNameList = new ArrayList<>();
    private List<String> contentNameList = new ArrayList<>();

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {

    };

    public void add(Course course, BaseLogger[] loggers) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("Kurs Ucreti 0'dan kucuk olamaz !");
        } else if (courseNameList.contains(course.getCourseName())) {
            throw new Exception("Kurs Adi Zaten Kayitli !");
        } else if (contentNameList.contains(course.getCategoryName())) {
            throw new Exception("Kategori adi Zaten Kaytili !");
        } else if (course.getPrice() < 0) {
            throw new Exception("Kategori ucreti sifirdan kucuk olamaz !");
        } else {
            System.out.println("Kurs Eklendi...");
            courseNameList.add(course.getCourseName());
            contentNameList.add(course.getCategoryName());
        }

        for (BaseLogger logger : loggers) {
            logger.logger(course.getCourseName());
        }


    }

}

