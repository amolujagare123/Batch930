package collectionsDemo.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDqueueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(23);
        ad.offer(13);
        ad.offer(33);
        ad.offer(43);
        ad.offer(123);

        System.out.println(ad);
        ad.offerFirst(0);
        ad.offerLast(99);

        System.out.println(ad);

        ad.pollFirst();
        ad.pollLast();

        System.out.println(ad);



        /*System.out.println(ad.poll());
        System.out.println(ad);

        System.out.println(ad.poll());
        System.out.println(ad);

        System.out.println(ad.poll());
        System.out.println(ad);

        System.out.println(ad.poll());
        System.out.println(ad);

        System.out.println(ad.poll());
        System.out.println(ad);*/



    }

}
