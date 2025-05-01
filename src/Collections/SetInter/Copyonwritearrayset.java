package Collections.SetInter;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Copyonwritearrayset {

    public static void main(String[] args) throws InterruptedException {

         Set<String> participents = new CopyOnWriteArraySet<>();
         participents.add("Felix");
         participents.add("Dhru");
         participents.add("Yash");

         // create thread pool
        ExecutorService execute = Executors.newFixedThreadPool(3);

        execute.submit(()->{
            try{
                Thread.sleep(100);
                participents.add("Krunal");
                System.out.println("Participent added.");
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        });


        execute.submit(()->{
            try{
                System.out.println("Participent (Thread 2)");
                participents.forEach(p-> System.out.println(" - "+p));
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        });

        execute.submit(()->{
            try{
                Thread.sleep(200);
                System.out.println("Participent (Thread 3)");
                participents.forEach(p-> System.out.println(" - "+p));
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        });

        execute.shutdown();
        execute.awaitTermination(1, TimeUnit.SECONDS);
    }
}
