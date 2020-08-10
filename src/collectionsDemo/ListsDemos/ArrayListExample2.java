package collectionsDemo.ListsDemos;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args)
    {
        ArrayList<String> alStr = new ArrayList<>();

        alStr.add("abc1");
        alStr.add("abc2");
        alStr.add("abc3");
        alStr.add("abc4");
        alStr.add("abc5");

        System.out.println(alStr);
       // alStr.remove(3);
        //alStr.remove("abc2");
        //System.out.println(alStr);
        alStr.clear();

        System.out.println(alStr);
        ArrayList<String> alStr1 = new ArrayList<>();

        alStr1.add("pqr1");
        alStr1.add("pqr2");
        alStr1.add("pqr3");
        alStr1.add("pqr4");
        alStr1.add("pqr5");
        alStr1.add("abc3");
        alStr1.add("abc4");
        alStr1.add("abc5");
       // System.out.println(alStr1);

        //alStr1.removeAll(alStr);
        //System.out.println(alStr1);
        /*ArrayList<String> alStr1 = new ArrayList<>();

        alStr1.add("pqr1");
        alStr1.add("pqr2");
        alStr1.add("pqr3");
        alStr1.add("pqr4");
        alStr1.add("pqr5");
        System.out.println(alStr1);

        alStr.addAll(alStr1);

        System.out.println("after using ad all");
        System.out.println(alStr);*/

        /*for(int i=0; i<alStr.size() ;i++)
            System.out.println(alStr.get(i));
*/


       /* ArrayList<Integer> alInt = new ArrayList<>();
        alInt.add(23);
        alInt.add(23);
        alInt.add(23);
        System.out.println(alInt);

        for(int i=0; i<alInt.size() ;i++)
            System.out.println(alInt.get(i));*/
    }
}
