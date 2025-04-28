package Collections;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListInter {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        ArrayList<String> arrayList=new ArrayList<>();
        // In java 7 we don not specific the type in new ArrayList<String>();

        arrayList.add("felix");
        arrayList.add("pawan");
        arrayList.add("krunal");
        arrayList.add("dhru");
        int size=arrayList.size();
        System.out.println("get first value : "+arrayList.getFirst());

        for(int i=0;i<size;i++){
            System.out.println(arrayList.get(i));
        }
        for(String s:arrayList){
            System.out.println(s);
        }

        System.out.println(arrayList.contains("felix"));
        System.out.println(arrayList.contains("Radhe"));
        System.out.println(arrayList.contains("Felix"));


        ArrayList<Integer> list=new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] o =(Object[]) field.get(list);
        System.out.println("Arraylist capacity : "+o.length);

         list.add(1);

         // so after adding increase the capacity of arrayList is to  16
        // lets check if we remove the element capacity decrease or not ;
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        // after removing element capacity is not shrink so for that let's shrink the capacity through list.trimToSize()

        list.trimToSize();
         Object[] getList=(Object[]) field.get(list);
        System.out.println("ArrayList capacity : "+ getList.length);


//        System.out.println(list.get(0)); // it's throw error of indexOutOfBoundException because you get at intial level
//        System.out.println(list.size());



        // Multiple ways to create ArrayList :
        List<Integer> numList=new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        Integer[] list2= {1,2,3,4,5};
        List<Integer> list3 = Arrays.asList(list2);

        System.out.println("ArrayList type : "+numList.getClass().getName());
        System.out.println("list1 type : "+list1.getClass().getName());
        System.out.println("list2 type : "+list2.getClass().getName());
        System.out.println("list3 type : "+list3.getClass().getName());

        // in NUumList we can add element
        //  in list1 we cant not add element because there are fixed size
//        list1.add(10); // runtime pe issue aayega
        System.out.println(list1);
        // so learning is that when we make the list using Arrays.asList that is fixed and not adding and removing element in this list only you can replace element
        // you can set like following "
        list1.set( 1,10);
        System.out.println("list1 : "+list1);


        // another way to create list ;
        List<String> string = List.of("String", "Integer", "Boolean"); // this is unmodifiable

        // if i want to modifiable Normal array then to do follow :
        List<Integer> arrayList1 = new ArrayList<>(list1);
        arrayList1.add(100);
        System.out.println(arrayList1);


         // lets adding all element from a list to another list
        List<Integer> list10=new ArrayList<>();
        list10.addAll(list1);
        System.out.println(list10);

        // what operation we can do :
        //  adding element
        // adding element at index
        // accessing element by index
        // remove element by index
        // remove element by value -> first occurance ko remove kar dega by .remove() method : alert when you remove by value because it' support Object
        // so if you store integer so by default remove through index so for that you can do like .remove(Integer.valueOf(write value what you remove))
        // check element contains or not through .contains() -> pass the element or value
        // we can convert the list to array :

        Object[] array = list10.toArray();
        Integer[] array1 = list10.toArray(new Integer[0]);


        // you can sort the array :
        Collections.sort(list10);
        System.out.println(list10);


    }

}
