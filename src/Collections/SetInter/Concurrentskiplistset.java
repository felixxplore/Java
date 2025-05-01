package Collections.SetInter;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Concurrentskiplistset {
    public static void main(String[] args) throws InterruptedException {


        Set<Integer> leaderBoard = new ConcurrentSkipListSet<>();
        leaderBoard.add(100);
        leaderBoard.add(50);

        // create threadpool for concurrent operations
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // add score frequent write
        executor.submit(()->{
            leaderBoard.add(75);
            System.out.println("Added score 75");
        });

        // add another score  frequent write
        executor.submit(()->{
            try{
                Thread.sleep(50);
                leaderBoard.add(120);
                System.out.println("Added score 120");
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        });

        // read leaderboard sorted order
        executor.submit(()->{
            System.out.println("Leaderboard (Thread 3)");
            leaderBoard.forEach(l-> System.out.println(" - "+l));
        });


        // Read leaderboard again after update
        executor.submit(()->{
            try{
                Thread.sleep(100);
                System.out.println("Leaderboard Thread 4 after updates");
                leaderBoard.forEach(l-> System.out.println(" - "+l));
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}
