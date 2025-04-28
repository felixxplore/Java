package Collections.ListInerface;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {
    public static void main(String[] args) {

//Array list not allow to modified during iterator
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//         for(Integer e: list){
//             if(e==2){
//                 list.add(4);
//             }
//         }
//        System.out.println(list);

        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
         for(Integer e: list){
             if(e==2){
                 list.add(4);
                 System.out.println("Now list is updated...");
             }
         }
        System.out.println("latest list is : "+list);
    }
}
