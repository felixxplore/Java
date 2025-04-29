package Collections.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    public LRUCache(int capacity){
        super(3,0.50f,true);
        this.capacity=capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
         return size() > capacity; // when size of map > capacity it's remove least recently used -> LRU cache
        // referring to a cache replacement algorithm where the item that hasn't been accessed for the longest time is removed to make room for new items
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> map=new LRUCache<>(3);
        map.put("felix",21);
        map.put("pawan",20);
        map.put("dhru",20);
        map.put("felix",22);
        map.put("krunal",20);

        Set<Map.Entry<String, Integer>> strings = map.entrySet();
        for(Map.Entry<String, Integer> e:strings){
            System.out.println("Key : "+e.getKey()+" value : "+e.getValue());
        }
    }
}
