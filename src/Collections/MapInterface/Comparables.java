package Collections.MapInterface;

import java.util.ArrayList;
import java.util.List;

public class Comparables {
    public static void main(String[] args) {

        List<Person> list=new ArrayList<>();
        list.add(new Person("felix",21));
        list.add(new Person("pawan",19));
        list.add( new Person("dhru",20));

        list.sort(null); // natural order sorting
        System.out.println(list);
    }
}


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(o.getAge(), this.getAge());
    }
}
