import java.util.*;

public class StringMethods1 {
    public static void main(String args[])
    {
        String name="Rafath Ali";
        String name2="Rafath Ali";
        String name3="Shaik Asif";

        for(int i=0 ; i< name.length() ; i++)
        {
            System.out.print(name.charAt(i)+ " ");
        }

        System.out.println();
        if(name.equals(name2)){
            System.out.println("names are equal");

        }
        else 
        {
            System.out.println("names are not equal");
        }

        if(name.compareTo(name3) > 0){
            System.out.println("name>name3");
        }
        else{
            System.out.println("name<=name3");
        }
    }
}
