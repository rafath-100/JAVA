package LambdasAndStreams;
//i -> i*i
public class TargetType {
    public interface Email{
        String contructEmail(String name);
    }
    Email email=(String name) -> name+"mirrafathali100@gmail.com";

    public String getEmail(String name, Email email){
        return null;
    }
    public static void main(String[] args) {
        new TargetType.getEmail("Rafath", (String name) -> name + "mirrafathali100@gmail.com");
    }
}
