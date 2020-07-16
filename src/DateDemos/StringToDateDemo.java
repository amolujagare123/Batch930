package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateDemo {

    public static void main(String[] args) throws ParseException {

        String str = "13/08/2016";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sd.parse(str);

        System.out.println(date1);

        // FDS       PSD

// Home work
        String dateStr0= "23-June- 2016";  // dd-MMMM- yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM- yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);

        String dateStr1= "23 | June 16  8:34"; // dd | MMMM yy h:mm

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date01 = sd1.parse(dateStr1);
        System.out.println(date01);

        String dateStr2= "2016 - 06 - 23 | 8:34:23";

        String dateStr3= "Thursday 2016/06/23";

        String dateStr4= "23-06-2016 | thurs | 8:34";

        String dateStr5= "8:34:22";
    }
}
