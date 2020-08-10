package collectionsDemo.ListsDemos;

import java.util.LinkedList;

public class LinkedListDmo {

    public static void main(String[] args) {


        LinkedList ll = new LinkedList();
        ll.add("amol1");
        ll.add("amol2");
        ll.add("amol3");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
