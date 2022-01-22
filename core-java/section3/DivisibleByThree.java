import java.util.PropertyResourceBundle;
import java.util.Scanner; 
public class DivisibleByThree 
{
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        int input;
        
        System.out.println("please enter your number");
        input=keyboard.nextInt();

        if(input%3==0)
            System.out.println(input+ " is divisible by 3");
        else
            System.out.println("not divisible");
    }
}
