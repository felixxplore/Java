package Collections.Queue;

import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(34);
        pq.add(32);

        System.out.println("Peek element : "+pq.peek());
        System.out.println("pq : "+pq);


    }
}
