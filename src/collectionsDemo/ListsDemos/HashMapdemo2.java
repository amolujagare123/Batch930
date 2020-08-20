package collectionsDemo.ListsDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapdemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        hm.put(545,"amol");
        hm.put(454,"praful");
        hm.put(1403,"amol");
        hm.put(104,"rani");
        hm.put(1105,"vaishali");
        hm.put(106,"xyz");

          Set hs =  hm.keySet();
            System.out.println(hs);

          Collection c =  hm.values();

        System.out.println(c);

        Set entries =   hm.entrySet();

        System.out.println(entries);


    }
}
