public class ControlStatementsIntro 
{
   public static void main(String args[]) 
   {
       int age=18;
       if(age>=18)
       {
           System.out.println("you can drive");
       }
       else
       {
           System.out.println("You cannot drive");
       }

       System.out.println();
       for(int i=1 ; i<=age ; i++){
           System.out.println("Happy Birthday " +i);
       }
   } 
}
