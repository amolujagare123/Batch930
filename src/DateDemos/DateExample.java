package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");

        // convert the date into string

        String dateStr = sd.format(date);

        System.out.println(dateStr);
        System.out.println(sd.format(date));
    }


}
