package collectionsDemo.ListsDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {


        ArrayList al  = new ArrayList(); // not generic

        al.add("amol");
        al.add("priyanka");
        al.add("praful");
        al.add("mayur");
        al.add("sandeep");

        System.out.println(al);

        System.out.println(al.size());

        al.add("vaishali");
        al.add("chaitanya");
        al.add("chaitanya");
        al.add('v');
        al.add(23);
        al.add(123.56);

        al.add(null);

        System.out.println(al);
        System.out.println(al.size());



        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));

        }

        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
