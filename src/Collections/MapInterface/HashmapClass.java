package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashmapClass {
    public static void main(String[] args) {

        /**
         * HashMap
         * add element
         * get element
         * key exist or not -> return boolean
         * value exist or not -> value contains or not return boolean
         * get all keys : .keySet() -> here use set because all keys are unique
         * implement iteration using .entrySet()
         * in hashmap all keys to convert first character to uppercase
         * remove keys from hashmap
         * you can create hashmap through intialcapacity and also load factor : how much threshold so hashmap it resizing
         *
         */

        HashMap<String ,Integer> m1=new HashMap<>();
        m1.put("felix",22);
        System.out.println("age : "+m1.get("felix"));
        if(m1.containsKey("felix")) System.out.println("Felix key exists");
        if(!m1.containsValue(21)) System.out.println("21 age as value not exist");
        Set<String> strings = m1.keySet();
        for(String s:strings){
            System.out.println(s);
        }
        Set<Map.Entry<String, Integer>> entries = m1.entrySet();
        for(Map.Entry<String, Integer> e : entries){
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println("Key : "+key.toUpperCase() + " value : "+value);
        }

        m1.remove("felix");
        System.out.println("After removing felix as key now their value is  : "+m1.get("felix"));





        // when you store custom class as key must provide implementation hashcode and equals method
        HashMap<Student,Integer> map=new HashMap<>();
        Student s1=new Student("felix",21);
        Student s2=new Student("pawan",21);
        Student s3=new Student("felix",21);
        map.put(s1,99);
        map.put(s2,80);
        map.put(s3,100);

        System.out.println("size of map : "+map.size());
        System.out.println("felix marks : "+map.get(s1));
        System.out.println("pawan marks : "+map.get(s2));
        System.out.println("felix marks : "+map.get(s3));

        Set<Student> students = map.keySet();
        for(Student s:students){
            System.out.println("name : "+s.getName()+ " age : "+s.getAge()+ " marks "+ map.get(s));
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return Objects.hash(name,age);
    }


    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);

        if(this == obj){
            return true;
        }else if(obj== null){
            return false;
        }else if(getClass()!= obj.getClass()){
            return false;
        }

        Student obj1 = (Student) obj;
        return this.getAge()==obj1.getAge() && this.getName().equals(obj1.getName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}