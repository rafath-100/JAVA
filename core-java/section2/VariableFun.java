
import java.util.Scanner;

public class VariableFun
{
    public static void main(String[] args) {
        int age=20;
        String name="Rafath";

        System.out.println(name+" is "+age);
    }

    public static class AverageOfThree
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("please enter 3 numbers:");
            double num1=sc.nextDouble();
            double num2=sc.nextDouble();
            double num3=sc.nextDouble();
            double average=(num1+num2+num3)/3;
            System.out.println("average of 3 numbers is:"+average);
        }
    }
}
