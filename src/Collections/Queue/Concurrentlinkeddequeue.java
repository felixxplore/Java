package Collections.Queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Concurrentlinkeddequeue {
    public static void main(String[] args) {

        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.addLast("Element2");

        System.out.println(deque);




    }
}
