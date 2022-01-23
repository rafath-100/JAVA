import java.util.*;

public class ArrayListProject2 
{
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Double> myList=new ArrayList<>();

        double input;

        System.out.println("Enter 0 or more to put in the list" + "or -1 to exit");
        input = keyboard.nextDouble();

        while(input>=0){
            myList.add(input);
            System.out.println("Enter 0 or more to put in the list" + "or -1 to exit");
            input=keyboard.nextDouble();

        }
        for(int i=0 ; i<myList.size() ; i++)
        {
            System.out.println(myList.get(i));
        }
    }    
}
