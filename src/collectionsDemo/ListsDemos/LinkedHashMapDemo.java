package collectionsDemo.ListsDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        hm.put(545,"amol");
        hm.put(454,"praful");
        hm.put(1403,"amol");
        hm.put(104,"rani");
        hm.put(1105,"vaishali");
        hm.put(106,"xyz");

        System.out.println(hm);

        LinkedHashMap<Integer,String> lmh = new LinkedHashMap<>();

        lmh.put(545,"amol");
        lmh.put(454,"praful");
        lmh.put(1403,"amol");
        lmh.put(104,"rani");
        lmh.put(1105,"vaishali");
        lmh.put(106,"xyz");

        System.out.println(lmh);




        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(545,"amol");
        tm.put(454,"praful");
        tm.put(1403,"amol");
        tm.put(104,"rani");
        tm.put(1105,"vaishali");
        tm.put(106,"xyz");

        System.out.println(tm);
    }




}
