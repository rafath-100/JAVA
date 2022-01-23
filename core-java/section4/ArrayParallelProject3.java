import java.util.*;

public class ArrayParallelProject3 
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String name;
        int age;
        for(int i=0; i<=5; i++){
            System.out.println("Enter a name:\t");
            name=keyboard.nextLine();
            System.out.println("Enter an age:\t");
            age=keyboard.nextInt();

            keyboard.nextLine();

            names.add(name);
            ages.add(age);
            System.out.println();
        }

        for(int i=0 ; i<names.size() ; i++)
        {
            System.out.println(names.get(i)+ " is "+ages.get(i)+" years old");
        }
    }   
}
