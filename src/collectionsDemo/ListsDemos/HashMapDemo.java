package collectionsDemo.ListsDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        System.out.println(hm.isEmpty());

        hm.put(545,"amol");
        hm.put(454,"praful");
        hm.put(1403,"amol");
        System.out.println(hm.put(104,"rani")); // null
        hm.put(1105,"vaishali");

        hm.put(106,"xyz");


        System.out.println(hm);

        System.out.println(hm.put(102,"new value")); // old value - praful

        System.out.println(hm);

        System.out.println(hm.get(102));

        hm.remove(102);

        System.out.println(hm);

        System.out.println(hm.containsKey(140));

        System.out.println(hm.containsValue("amol1"));

        System.out.println(hm.isEmpty());

        System.out.println(hm.size());

        hm.clear();

        System.out.println(hm);
    }
}
