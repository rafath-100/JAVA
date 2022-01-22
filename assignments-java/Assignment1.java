// import java.util.Scanner; 
// import java.util.regex.*; 
// import java.io.File; 

// public class Assignment1 
// {
//     public static void main(String args[])
//     {
//         Scanner keyboard=new Scanner(System.in);
//         File file;
//         File[] paths;
//         try{
//             String fileName;
//             boolean flag=false;

//             file=new File("/home/Desktop/clean-code/SRP.java");
//             paths=file.listFiles();

//             System.out.println("Enter file name or terminate the process: ");
//             fileName=keyboard.next();

//             while(!fileName.equals("exit"))
//             {
//                 Pattern pattern=Pattern.compile(fileName);

//                 for(File path: paths)
//                 {
//                     Matcher matcher = pattern.matcher(path.getName());
//                     flag = matcher.matches();
//                     if(flag)
//                     {
//                         System.out.println("Full Path: "+ path.getAbsolutePath());
//                         break;
//                     }
//                 }
//                 if(!flag)
//                 {
//                     System.out.println(fileName+ " Not found");
//                 }
//                 System.out.println("Enter file name or terminate the process: ");
//                 fileName = keyboard.next();
//             }
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }

import java.io.File;
import java.util.Scanner;
import java.util.regex.*;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        File file;
        File[] paths;

        try {
            String fileName;
            boolean flag = false;

            file = new File("/home/Desktop/clean-code");
            paths = file.listFiles();

            System.out.println("Enter the file name as regular expression  or type exit to terminate : ");
            fileName = input.next();

            while(!fileName.equals("exit")){
                Pattern pattern = Pattern.compile(fileName);

                for(File path : paths){
                    Matcher matcher = pattern.matcher(path.getName());
                    flag = matcher.matches();
                    if(flag){
                        System.out.println("Full Absolute Path : " + path.getAbsolutePath());
                        break;
                    }
                }

                if(!flag){
                    System.out.println(fileName + " Not Found");
                }

                System.out.println("Enter the file name as regular expression or type exit to terminate : ");
                fileName = input.next();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}