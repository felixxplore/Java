package Collections.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value=0;

    public  Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override public void run(){
        while(true){
           try{
               System.out.println("Producer produced: "+ value);
               queue.put(value++);
               Thread.sleep(500);
           }catch(Exception e){
               Thread.currentThread().interrupt();
               System.out.println("Producer interrupted.");
           }

        }
    }
}


class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override public void run(){
        while(true){
            try{
                Integer value=queue.take();
                System.out.println("Consumer consume : "+value);
                Thread.sleep(1000);
            }catch(Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted.");
            }

        }
    }
}


public class Blockingqueue {
    public static void main(String[] args) {

        // standard queue --> immediately
           // empty -> remove  -> no waiting
            // full -> add -> no waiting

        // Blocking queue
            // put --> blocks if the queue is full until space becomes available
            // take --> block if the queue is empty until element become available
            // offer -->  waits for space to become available, up to the specified timeout -> you can set time for how much time i wait.



          BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        // here producer thread try to put -> when size==capacity then vo wait karega
        // and if consumer thread -> if empty then again wait karega
        producer.start();
        consumer.start();

    }
}
