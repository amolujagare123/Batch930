package ExceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "29/11/2020";

        try {

            SimpleDateFormat sd = new SimpleDateFormat("dd /MM/yyyy");
            Date date = sd.parse(dateStr);
        }
        catch (Exception e)
        {
            System.out.println("in catch block");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

           // e.printStackTrace();
        }

        System.out.println("Below is the converted date");
       // System.out.println(date);

    }
}
