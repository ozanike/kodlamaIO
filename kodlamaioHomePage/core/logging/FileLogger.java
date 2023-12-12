package kodlamaioHomePage.core.logging;

public class FileLogger implements BaseLogger{
    public void logger(String message){
        System.out.println("File Logger : " + message);
    }
}
