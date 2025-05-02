package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorImpl {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
         list.add(10);
         list.add(11);
         list.add(12);
         list.add(13);
         list.add(14);
         list.add(15);
         list.add(16);


         // usign foreach loop we can not rmeove during iteration
//         for(Integer e:list){
//             System.out.println(e);
//             if(e%2==0){
//                 list.remove(e);
//             }
//         }

        // using Iterator we can do remove during iteration.
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            Integer next = iterator.next();
//            if(next%2==0){
//                iterator.remove();
//            }
//        }System.out.println("After removing even : "+list);

        ListIterator<Integer> integerListIterator = list.listIterator();

        while(integerListIterator.hasNext()){
            Integer next = integerListIterator.next();
            if(next%2==0){
                integerListIterator.set(0); // set even 0
            }
        }

        System.out.println("set even to even numbers in ListIterator : "+list);

    }
}
