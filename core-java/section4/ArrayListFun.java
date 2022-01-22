
import java.util.*;

public class ArrayListFun {
    public static void main(String args[])
    {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Mir");
        nameList.add("Rafath");
        nameList.add("Ali");
        nameList.add("Rayees");
        nameList.add("Asif");

        for(int i=0 ; i<nameList.size() ; i++)
        {
            System.out.println(nameList.get(i));
        }
    }    
}
