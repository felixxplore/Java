package Generic;

public class Pair<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Pair<String,Integer> map=new Pair<>();
        map.setKey("Felix");
        map.setValue(22);

        String key1 = map.getKey();
        Integer value1 = map.getValue();
        System.out.println("Key : "+key1 + " Value : "+value1);


    }
}


/*
* T -> type
* E -> Element used in collection
* K -> key used in map
* V -> value used in map
* N -> number
*/