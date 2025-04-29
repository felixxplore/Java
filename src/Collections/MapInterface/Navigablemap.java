package Collections.MapInterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigablemap {
    public static void main(String[] args) {

        NavigableMap<Integer,String> map=new TreeMap<>();
         map.put(1,"shiv");
         map.put(2,"Radhe");
         map.put(5,"varun");
         map.put(7,"krishna");

        System.out.println(map);
        System.out.println("lower entry from 5 : "+map.lowerEntry(5));
        System.out.println("above entry from 5 : "+map.ceilingEntry(5));
    }
}
