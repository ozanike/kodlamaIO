package kodlamaioHomePage.entites;

public class Course {
    private String courseName;
    private String categoryName;
    private double price;

    public Course(String courseName, String categoryName, double price) {
        this.courseName = courseName;
        this.categoryName = categoryName;
        this.price = price;
    }

    public Course(){
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setDescription(String description) {
        this.categoryName = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
