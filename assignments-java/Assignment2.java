
import java.util.Scanner;

public class Assignment2 {
   public static void main(String[] args) {
      String string1; 
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter your String ");
      string1 =input.nextLine();
      string1 = string1.toLowerCase();
      boolean[] alphaList = new boolean[26]; 
      int index = 0;
      int flag = 1;
      for (int i = 0 ; i < string1.length() ; i++) {
        if( string1.charAt(i) >= 'a' &&  string1.charAt(i) <= 'z') {
            index = string1.charAt(i) - 'a'; 
         }
         alphaList[index] = true; 
      }
      for (int i = 0; i <= 25; i++) {
         if (alphaList[i] == false)
            flag = 0;
      }
      System.out.print("String: " + string1);
      if (flag == 1)
         System.out.print("\nThe above string is a pangram.\n ");
      else
         System.out.print("\nThe above string is not a pangram.\n ");
   }
}
