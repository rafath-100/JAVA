//latest work

import java.util.*;
 
public class ArraysProject1
{
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        int values[]=new int[5];

        for(int i=0 ; i<values.length ; i++)
        {
            System.out.println("enter an integer\t");
            values[i]=keyboard.nextInt();
        }

        for(int i=0 ; i<values.length ; i++)
        {
            
            System.out.println("result is "+ values[i]*2);
        }
    }
}