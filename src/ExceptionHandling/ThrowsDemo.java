package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

    public static void main(String[] args) throws FileNotFoundException {


        try {
            FileInputStream fp = new FileInputStream("C:\\Uers\\PC\\IdeaProjects\\Batch930\\src\\pack1\\Java1.java");
        }
        catch (FileNotFoundException e) {

            System.out.println(e.getClass());
           // e.printStackTrace();
        }


        FileInputStream fp = new FileInputStream("c:\\jit\\a.java");

    }
}
