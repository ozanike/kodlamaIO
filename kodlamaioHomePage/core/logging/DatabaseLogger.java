package kodlamaioHomePage.core.logging;

public class DatabaseLogger implements BaseLogger{
    public void logger(String message){
        System.out.println("Database Logger : " + message);
    }
}
