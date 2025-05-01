package Collections.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Synchronousqueue {
    public static void main(String[] args) {

        BlockingQueue<String> queue=new SynchronousQueue<>();

        Thread t1=new Thread(()->{

            try {
                System.out.println("Producer is waiting to transfer");
                queue.put("hello from producer");
                System.out.println("producer hash transferred the message");
            }catch(Exception e){
                System.out.println(e);
            }
        });

        Thread t2=new Thread(()->{

            try{
                System.out.println("Consumer is waiting to receive");
                String msg=queue.take();
                System.out.println("consumer received : "+msg);
            }catch(Exception e){
                System.out.println(e);
            }
        });


        t1.start();
        t2.start();
    }
}
