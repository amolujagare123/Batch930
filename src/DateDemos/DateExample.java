package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");

        String dateStr = sd.format(date);
        System.out.println(dateStr);

      //  String dateStr0= "23-June- 2016" ; // dd-MMMM- yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM- yyyy");
        String str0 = sd0.format(date);
        System.out.println(str0);

       // String dateStr1= "23 | June 16  8:34"; // dd | MMMM yy h:mm

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
        String str1 = sd1.format(date);
        System.out.println(str1);

        // String dateStr3= "Thursday 2016/06/23"

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String str2 = sd3.format(date);
        System.out.println(str2);


        // here we have converted Date to String


    }


}
