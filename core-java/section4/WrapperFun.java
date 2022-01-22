import java.util.*;

public class WrapperFun {
    public static void main(String args[])
    {
        ArrayList<Integer> myAL=new ArrayList();

        myAL.add(10);
        myAL.add(20);

        for(int i=0;i<myAL.size();i++){
            System.out.println(myAL.get(i));
        }

        String strPi="3.14159";
        double myPi=Double.parseDouble(strPi);
        System.out.println(myPi);

    }    
}
