package Collections.ListInerface;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) throws InterruptedException {

        /**
         * create with default constructor with 10 capacity
         * check capacity directly .capacity
         * you can define vector with custom capacity
         * add element
         * you can create vector where you can define how much grow vector when capacity is exceeded
         * create vector through pass another collection as specificed
         */


        Vector<Integer> v=new Vector<>(3,10);
        System.out.println("Deafult capacity : "+v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println("After exceed capacity then check : "+v.capacity());
        Vector<Integer> list=new Vector<>(Arrays.asList(21,22,24));
        System.out.println("Vector list : "+list);


        /** Methods in Vector
         * add element at end
         * add element at index
         * set element on index
         * get element by index
         * remove the first occurance element by element
         * remove the element by index
         * get size of vector
         * check empty or not
         * element exist or not
         * remove all elements in vector
         */
        v.add(50);
        v.add(0,100);
        v.set(1,200);
        System.out.println("first element : "+v.get(0));
        System.out.println("Before removing the 20 vector look like : "+v);
        v.remove((Integer) 20);
        System.out.println("After removing the 20 vector look like : "+v);
        v.remove(v.size()-1);
        System.out.println("After removing last element "+ v);
        if(!v.isEmpty()){
            System.out.println("Vector is not empty.");
        }
        if(v.contains(100)){
            System.out.println("Check 100 exist or not in vector if yes that this print. ");
        }
        v.clear();
        System.out.println("Now vector is clear.");


        //* Use Vector in Multithread environment
        Vector<Integer> v1=new Vector<>();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                v1.add(i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                v1.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("after run 2 thead let's see what size of vector : "+v1.size());

        // we use vector here so it successfully return 2000 that means it thread safe and follow locks
        // while if we use ArrayList that means not get 2000 that means it not thread safe and now follow locks
    }
}
