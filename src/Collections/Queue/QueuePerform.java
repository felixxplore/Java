package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePerform {
    public static void main(String[] args) {

        // here we try to acts LinkedList as Queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(10); // add called enqueue
        queue.addLast(20);
        queue.addLast(30);
        System.out.println("Queue ; "+queue);
        System.out.println("removing first element : ");
        queue.removeFirst(); // remove called  dequeue
        System.out.println("After removing first element then queue : "+queue);

        // but it's very complex so java provides queue
        // linkedlist implemention class of queue

        Queue<Integer> q1=new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println("queue : "+q1);
        q1.remove();
        System.out.println("after removing : "+q1);

    }
}
