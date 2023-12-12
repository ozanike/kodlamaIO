package kodlamaioHomePage.core.logging;

public class EmailLogger implements BaseLogger{
    public void logger(String message){
        System.out.println("Email Logger : " + message);
    }
}
