package collectionsDemo.Setdemos;

import java.sql.SQLOutput;
import java.util.HashSet;

public class HashsetDemo {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add("abc1");
        hashSet.add("abc2");
        hashSet.add("abc3");
        hashSet.add(23);
        hashSet.add('l');
        hashSet.add(null);

        System.out.println(hashSet);
        System.out.println(hashSet.add("abc1"));

        System.out.println(hashSet);

    }

}
