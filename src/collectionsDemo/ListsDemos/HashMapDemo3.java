package collectionsDemo.ListsDemos;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        hm.put(545,"amol");
        hm.put(454,"praful");
        hm.put(1403,"amol");
        hm.put(104,"rani");
        hm.put(1105,"vaishali");
        hm.put(106,"xyz");
        hm.put(107,null);
        hm.put(108,null);
        hm.put(109,null);
        hm.put(null,"xyz");
        hm.put(null,"pqr");


        System.out.println(hm);





        HashMap<Integer,String> hm1 = new HashMap();
        System.out.println(hm1);

        hm1.putAll(hm);

        System.out.println(hm1);




    }
}
