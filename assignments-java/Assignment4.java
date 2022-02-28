import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class KYC{
    private String anniversary;
    private Date signInDate;
    private Date todayDate;
    public void calculateRange(String signIn,String today){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            signInDate=dateFormat.parse(signIn);
            todayDate=dateFormat.parse(today);
            if(signInDate.compareTo(todayDate)>0)
                System.out.println("no range");

            else {
                String newString=signIn.substring(0,6);

                anniversary=newString.concat(today.substring(6,10));

                //System.out.println(anniversary);
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(dateFormat.parse(anniversary));

                calendar.add(Calendar.DATE,-30);
                String startRange= dateFormat.format(calendar.getTime());
                System.out.print(startRange);

                calendar.setTime(dateFormat.parse(anniversary));
                calendar.add(Calendar.DATE,+30);
                String endRange="";
                if(calendar.getTime().compareTo(todayDate)>0)
                {
                    endRange= dateFormat.format(todayDate);
                    System.out.print("\t"+endRange+"\n");
                }
                else
                    System.out.print("\t" + dateFormat.format(calendar.getTime())+"\n");

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class Main {

    public static void main(String[] args) {
        KYC kyc=new KYC();
        kyc.calculateRange("16-07-1998", "27-06-2017");
        kyc.calculateRange("04-02-2016", "04-04-2017");
        kyc.calculateRange("04-05-2017", "04-04-2017");
        kyc.calculateRange("04-04-2015", "04-04-2016");
        kyc.calculateRange("04-04-2015", "15-03-2016");
    }
}
---------------------------------------------------------------------------------------------------------
//Expected Output:
    
// 16-06-2017	27-06-2017
// 05-01-2017	06-03-2017
// no range
// 05-03-2016	04-04-2016
// 05-03-2016	15-03-2016
