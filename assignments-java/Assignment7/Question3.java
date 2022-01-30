package Assignment7;

interface A
{
    void first();
    void second(); 
}
interface B{
    void third();
    void fourth();
}
interface C{
    void fifth();
    void sixth();
}
interface Fourth extends A,B,C{
    void newMethod();
}

abstract class Fifth implements Fourth{
    // public void first()
    // {
    //     System.out.println("this is first method");
    // }
    public void second()
    {
        System.out.println("this is second method");
    }
    public void third()
    {
        System.out.println("this is third method");
    }
    public void fourth()
    {
        System.out.println("this is fourth method");
    }
    public void fifth()
    {
        System.out.println("this is fifth method");
    }
    public void sixth()
    {
        System.out.println("this is sixth method");
    }

    public void newMethod() {
        System.out.println("this is a new method");
    }
}
public class Question3 extends Fifth
{
    public static void main(String args[]){
        Question3 object=new Question3();
        
        object.second();
        object.third();
        object.fourth();
        object.fifth();
        object.sixth();
        System.out.println();
        object.newMethod();
        
        System.out.println();
        object.first();
    }

    @Override
    public void first() {
        // TODO Auto-generated method stub
        System.out.println("this is first method");
    }
}