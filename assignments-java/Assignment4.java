
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String []args) throws ParseException {
        Scanner input = new Scanner(System.in);

        int testCases = 0;
        testCases = input.nextInt();

        while(testCases > 0){
            //Declaring Signup and Current date for kyc approval
            String signupDate = input.next();
            String currentDate = input.next();

            //creating calendar object below
            Calendar calendar = Calendar.getInstance();

            //Converting date to string
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date signUpDate = simpleDateFormat.parse(signupDate);
            Date currDate = simpleDateFormat.parse(currentDate);

            if(signUpDate.after(currDate)){
                System.out.println("No range");
            }

            calendar.setTime(currDate);
            int currYear = calendar.getWeekYear();

            calendar.setTime(signUpDate);
            int signUpYear = calendar.getWeekYear();

            calendar.add(Calendar.YEAR,currYear - signUpYear);

            calendar.add(Calendar.DATE,-30);
            Date startDate = calendar.getTime();

            calendar.add(Calendar.DATE,60);
            Date endDate = calendar.getTime();

            if(endDate.after(currDate)){
                endDate = currDate;
            }

            System.out.println(simpleDateFormat.format(startDate) + "  "
                    + simpleDateFormat.format(endDate));

            testCases--;
        }

    }
}