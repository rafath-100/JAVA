package rafathAssignment5;

public class MainClass{
    public static void main(String args[])
    {
        Data dataObject =new Data();
        //global variables which can get default values.
        dataObject.display();
        //local variables which are not initialized but does not get any default values.
        dataObject.show();
        //static methods can only access static variables.
        Singleton singletonObject = new Singleton();
        singletonObject.print();
    }
}