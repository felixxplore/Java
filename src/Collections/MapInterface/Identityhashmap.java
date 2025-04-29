package Collections.MapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Identityhashmap {
    public static void main(String[] args) {

//        String key1=new String("key");
//        String key2=new String("key");
        String key3="key";
        String key4="key";
        System.out.println("Key 3 hashcode : "+System.identityHashCode(key3));
        System.out.println("Key 4 hashcode : "+System.identityHashCode(key4));

        Map<String,Integer> map=new IdentityHashMap<>();
        // now here use Object class hashcode and == for checking equality on reference
//        map.put(key1,1);
//        map.put(key2,2);
        map.put(key3,3);
        map.put(key4,4);
        System.out.println(map);
    }
}
