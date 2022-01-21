
import java.util.Random;

public class DiceSimulation {
    public static void main(String []args){
        Random random = new Random();

        int dice;
        int roll = 1;

        while(roll <= 10){
            System.out.println("The output of roll " + roll + " is " + random.nextInt(7));
            roll++;
        }
    }
}