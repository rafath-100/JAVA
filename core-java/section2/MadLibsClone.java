
import java.util.Scanner;

public class MadLibsClone
{
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        String adjective1;
        String girlName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.println("Enter an adjective\t");
        adjective1=keyboard.nextLine();

        System.out.println("Enter a girl's name\t");
        girlName=keyboard.nextLine();

        System.out.println("Enter another adjective\t");
        adjective2=keyboard.nextLine();

        System.out.print("Enter an Occupation\t");
        occupation1 = keyboard.nextLine();

        System.out.print("Enter the name of a place\t");
        placeName = keyboard.nextLine();

        System.out.print("Enter the name of a piece of clothing\t");
        clothing = keyboard.nextLine();

        System.out.print("Enter the name of a hobby\t");
        hobby = keyboard.nextLine();

        System.out.print("Enter another adjective\t");
        adjective3 = keyboard.nextLine();

        System.out.print("Enter another occupation\t");
        occupation2 = keyboard.nextLine();

        System.out.print("Enter a boy's name\t");
        boysName = keyboard.nextLine();

        System.out.print("Enter a man's name\t");
        mansName = keyboard.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlName + " who was an " + adjective2 + " " + occupation1 + " in the Kingdom of " + placeName + ".");
        System.out.println("She loved to wear " + clothing + " and love to play " + hobby + ". She wanted to marry the " + adjective3+" "+occupation2 + " named " + boysName + " but her father, King "+ mansName + " forbid her from seeing him.");


    }
}
