package Generic.MiniProject;

import java.util.*;

class KeyValueStore<K extends Comparable<K>,V>{
    private Map<K,V> store;

    public KeyValueStore(){
         this.store=new HashMap<>();
    }

    public void put(K key,V value){
        store.put(key,value);
    }

    public V get(K key){
        return store.get(key);
    }

    // Generic for upperbound for reading data from KeyValueStore
    public void printKeys(Map<? extends K,? extends V> map){
        for(K key:map.keySet()){
            System.out.println("Key : "+key);
        }
    }
}

public class GenericKeyValueStore{

    public static void main(String[] args) {

        KeyValueStore<String,Integer> map=new KeyValueStore<>();
        map.put("felix",22);
        map.put("pawan",20);
        map.put("krunal",20);
        System.out.println(map.get("felix"));

        Map<String,Integer> anotherMap=new HashMap<>();
        anotherMap.put("charlie",35);
        map.printKeys(anotherMap);


    }
}
