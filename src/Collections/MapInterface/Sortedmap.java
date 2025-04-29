package Collections.MapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap {
    public static void main(String[] args) {

        // by default natural ascending order and alphabetical in a to z and A to Z : for descending order use comparator

//        SortedMap<String ,Integer> map=new TreeMap<>((a,b)-> b-a); // it's not apply in string key
        SortedMap<Integer ,String> map=new TreeMap<>((a,b)-> b-a); // it's not apply in string key

        map.put(20,"felix");
        map.put(21,"dhru");
        map.put(22, "krunal");

        System.out.println("first : "+map.firstEntry());
        System.out.println("last : "+map.lastEntry());
//        System.out.println("get list from f "+map.tailMap("f"));
//        System.out.println("get list to f : "+map.headMap("f"));
        System.out.println(map);
    }
}
