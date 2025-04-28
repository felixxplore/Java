package Collections.ListInerface;

import java.util.Arrays;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        /**
         * create
         * add
         * remove
         * return head element in stack
         * empty or not
         * check size
         * add at index
         * remove at index
         * remove through object
         * search -> top se start hoke counting karke return karega start from 1 not 0
         * Use Linkedlist as stack : so we can implement stack using Stack and LinkedList
         * agar java me linkedlist singular hoti then we cant perform stack because singly linkedlist one way hoti hain : backward  nahi hoti but in java linkedlist is double so we can forwared and backword both
         *
         */
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(0,100);
        s.remove(1);
        s.add(1,200);
        s.remove((Integer) 100);
        s.add(300);
        System.out.println("Return head in stack : "+s.peek());
        System.out.println("Size of stack : "+s.size());
        System.out.println("search : "+s.search(200));
        s.addAll(Arrays.asList(1000,900,800,700));

        if(!s.isEmpty()){
            System.out.println("stack is not empty");
        }
        System.out.println(s);
    }


}
