package Collections.MapInterface;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtables {
    public static void main(String[] args) {

//        Hashtable<Integer,String> map=new Hashtable<>(); // its thread safe
        HashMap<Integer, String> map = new HashMap<>(); // its not thread safe.
        Thread t1=new Thread(()->{

            for(int i=0;i<1000;i++){
                map.put(i,"Thread1");
            }
        });


        Thread t2=new Thread(()->{

            for(int i=1000;i<2000;i++){
                map.put(i,"Thread2");
            }
        });

        t1.start();
        t2.start();
        try{
             t1.join();
             t2.join();
        }catch(Exception e){

        }

        System.out.println(map.size());

        // support features who in hashmap
    }
}
