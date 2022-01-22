import java.util.*;
public class MoreArrayFun {
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        int array[]=new int[10];

        for(int i=0 ; i<array.length ; i++)
        {
            array[i] = i+1;
        }

        for(int i=0 ; i<array.length ; i++)
        {
            System.out.println(array[i]);
        }
    }
}
