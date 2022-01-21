
import java.util.Scanner;

public class Faternity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        char gender;

        System.out.print("Enter Your age : ");
        age = input.nextInt();

        System.out.print("Enter your gender : ");
        gender = input.next().charAt(0);

        if(age >= 19 && (gender == 'M' || gender == 'm')){
            System.out.println("Welcome to the Faternity Group");
        }else {
            System.out.println("Sorry you can't join the group");
        }

    }
}