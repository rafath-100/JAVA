package Assignment9;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Assignment9 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        Pattern pattern = Pattern.compile("[A-Z].+[.]");
        Matcher matcher = pattern.matcher(inputString);
        if(matcher.matches()){
            System.out.println("The input matches the pattern");
        }else {
            System.out.println("Input does not match");
        }
    }
}
