package collectionsDemo.ListsDemos;

import java.util.HashMap;

public class HashMapHeterogeneous {

    public static void main(String[] args) {

        HashMap hm =new  HashMap();

        hm.put(545,"amol");
        hm.put(true,"praful");
        hm.put(12.5,'n');
        hm.put("amol",34);
        hm.put(454,23.78);
        hm.put(454,true);

        System.out.println(hm);


    }
}
