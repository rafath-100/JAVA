//Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
 
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {

    public static void main(String[] args) {
        boolean matchFound=false;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("enter the name of the file");

            String input = keyboard.nextLine();

            //here we are entering a file name to search in a particular directory
            File file = new File("/home/rafatam/Desktop");
            String[] fileList = file.list();

            for (String fileNames : fileList) {
                // Creating a pattern of the file to be searched
                Pattern pattern = Pattern.compile(input);
                // Searching above pattern in the list of files
                Matcher matcher = pattern.matcher(fileNames);
                matchFound = matcher.find();
                //if match is found come out of the loop
                if (matchFound)
                    break;
            }

            if (matchFound) {
                System.out.println("Match found - Here is the absolute path =>" + file.getAbsolutePath());
            } else {
                System.out.println("Sorry, the Match is not there :(");
            }

            File[] paths;
            String[] pathnames;
            paths = file.listFiles();
            pathnames=file.list();

            //with the following loop will be able to print all the files that are present in that directory or folder.
            for(String pathname : pathnames ){
                System.out.println(pathname);
            }
        }  while (true) ;
    }
}