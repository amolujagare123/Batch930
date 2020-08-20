package collectionsDemo.ListsDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add("amol");
        ts.add("rahul");
        ts.add("praful");
        ts.add("rani");
        ts.add("priyanka");
      /*  ts.add('b');
        ts.add(90);
        ts.add(null);*/

        System.out.println(ts);
        System.out.println(ts.add("amol"));
        System.out.println(ts);
    }
}
