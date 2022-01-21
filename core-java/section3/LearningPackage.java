
import java.util.Scanner;

public class LearningPackage {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int packageNumber;
        int howManyCourses;
        int baseCost = 0;
        int costPerCourse = 0;
        int numIncluded = 0;
        int totalCost;

        System.out.println("Welcome to Learing Package Platform");
        System.out.println("1. 10$/month with 2 courses ");
        System.out.println("2. 12$/month with 4 courses ");
        System.out.println("3. 15$/month with 6 courses ");

        System.out.println("Enter you choice :");
        packageNumber = input.nextInt();

        System.out.println("How many courses you have enrolled ");
        howManyCourses = input.nextInt();

        if(packageNumber == 1){
            baseCost = 10;
            costPerCourse = 6;
            numIncluded = 2;
        }else if(packageNumber == 2){
            baseCost = 12;
            costPerCourse = 4;
            numIncluded = 4;

        }else if(packageNumber == 3) {
            baseCost = 15;
            costPerCourse = 3;
            numIncluded = 6;
        }else {
            System.out.println("Invalid options");
        }

        if(howManyCourses > numIncluded){
            totalCost = baseCost + (howManyCourses - numIncluded ) * costPerCourse;
        }else {
            totalCost = baseCost;
        }

        System.out.println("Your total cost is $" + totalCost);

    }
}