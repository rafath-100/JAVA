package rafathAssignment5;

public class Singleton{
    public String string;

    public static Singleton simpleMethod(String string) {
        //static methods can only access static variables;

        Singleton object = new Singleton();
        return object;
    }
    public void print() {
        System.out.println("The string is:"+string);
    }

}