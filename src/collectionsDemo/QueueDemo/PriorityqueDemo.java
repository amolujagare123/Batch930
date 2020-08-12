package collectionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityqueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(43);
        pq.offer(13);
        pq.offer(3);
        pq.offer(231);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        // some os doesnt support the priority

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
