import java.util.*;
public class GuessTheNumber {
    public static void main(String args[])
    {
        int myRandomNumber;
        Random random=new Random();
        //myRandomNumber=random.nextInt(100);
        //System.out.println("0 through 100\t"+myRandomNumber);

        Scanner keyboard=new Scanner(System.in);
        int computerNumber;
        int guessCount=0;
        int ourGuess;
        boolean guessNumber=false;
        computerNumber=random.nextInt(100)+1;

        while(!guessNumber){
            System.out.println("Enter your integer guess");
            ourGuess=keyboard.nextInt();
            guessCount++;

            if(ourGuess>=1 && ourGuess<=100){
                if(ourGuess == computerNumber){
                    System.out.println("Congrats! you guesssed the number in "+guessCount+ " guesses");
                    guessNumber = true;
                }
    
                else if(ourGuess > computerNumber){
                    System.out.println("Your guess is too huge");
                }
    
                else if(ourGuess < computerNumber){
                    System.out.println("your guess is too low");
                }
            }

            else{
                System.out.println("Invalid guess");
            }
        }

    }
}
