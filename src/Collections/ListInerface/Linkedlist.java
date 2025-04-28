package Collections.ListInerface;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        /**
         * Add
         * get(indx)
         * addFirst
         * addLast
         * getFirst
         * getLast
         * removeIf(condition)
         * make linkedlist through Arrays.asList
         * removeAll(list remove ho jayegi)
         */

        LinkedList<Integer> list=new LinkedList();
        list.add(10);
        list.add(20);
        System.out.println("first index element in list : "+list.get(1));
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(50);
        list.addLast(60);
        System.out.println("first elemetn in list : "+list.getFirst());
        System.out.println("last Element in list : "+ list.getLast());
        list.removeIf(x-> x%2==0);
        System.out.println("After removing even num : "+list);

        LinkedList<Integer> list1=new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> list2=new LinkedList(Arrays.asList(3,5));
        System.out.println("Before removing list2 in list1 : "+list1);
        list1.removeAll(list2);

        System.out.println("After removing list2 now list1 : "+ list1);

    }
}


