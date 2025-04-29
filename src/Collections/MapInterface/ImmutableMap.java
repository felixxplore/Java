package Collections.MapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {



        // way1 : create unmodifieable map
        Map<String,Integer> map=new HashMap<>();
        map.put("felix",22);
        map.put("pawan",20);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        map.put("dhru",20);

        // way2
        Map<String, Integer> map2 = Map.of("felix", 22, "pawan", 20); // problem is you can add more 10 entry
        Map<String, Integer> map3 = Map.ofEntries(Map.entry("felix", 22), Map.entry("pawan", 20)); // now in this you can any number of entries.
    }
}
