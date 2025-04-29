package Collections.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedhashmapClass {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map=new LinkedHashMap(16,0.75f,true);
        map.put("felix",22);
        map.put("pawan",21);
        map.put("dhru",20);
        map.put("krunal",19);

        map.get("felix");
        map.get("dhru");
        map.get("pawan");
        map.get("felix");
        map.get("dhru");
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for(Map.Entry<String, Integer> e :entry){
            System.out.println("key "+ e.getKey()+" value "+e.getValue());
        }


    }
}
