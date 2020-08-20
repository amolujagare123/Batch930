package collectionsDemo.ListsDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSetDemo {


    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("amol");
        lhs.add("rahul");
        lhs.add("praful");
        lhs.add("rani");
        lhs.add("priyanka");
        lhs.add('b');
        lhs.add(90);
        lhs.add(null);

        System.out.println(lhs);
        System.out.println(lhs.add("amol"));
        System.out.println(lhs);
    }
}
