package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {


        // learn custom sorting on Integer
        List<Integer> listInt=new ArrayList<>();
        listInt.add(10);
        listInt.add(100);
        listInt.add(90);
        listInt.add(95);
        listInt.add(80);

        listInt.sort(new CustomIntegerSorting());
        System.out.println("Custom Integer Sorting : "+listInt);


        // learn custom sorting logic : string length
        List<String> listStr=new ArrayList<>();
        listStr.add("A");
        listStr.add("AB");
        listStr.add("ABC");
        listStr.add("ABCD");
//        listStr.sort(new CustomStringLengthSorting());
        listStr.sort((a,b)-> a.length()-b.length()); // Ascending sorting based on string length in listStr
        listStr.sort((a,b)-> b.length()-a.length()); // descending sorting based on string length in listStr
        System.out.println("Custom String sorting : "+listStr);

        // use comaprator in custom Student object :
        List<Student> stdList=new ArrayList<>();
        stdList.add(new Student("Felix",22));
        stdList.add(new Student("pawan",20));
        stdList.add(new Student("Dhru",20));
        stdList.add(new Student("Ashwin",19));
        stdList.add(new Student("Ashish",18));

        stdList.sort((a,b)-> b.getAge()- a.getAge());
        System.out.println("Student list sorted by age");
        for(Student s:stdList){
            System.out.println("Name : "+s.getName()+" Age : "+s.getAge());
        }

        // custom sortind done by Lambda expression
        Comparator<Student> comparing = Comparator.comparing(Student::getName).thenComparing(Student::getAge);

        // lets do custom comparing same as above defined logic but implement without lambda expression
        stdList.sort(comparing);
        stdList.sort((a,b)->{
            if(b.getAge()-a.getAge() > 0){
                return 1;
            }else if(b.getAge()-a.getAge() <0){
                return -1;
            }else {
                return a.getName().compareTo(b.getName()); // if both equal then sort based on name as ascending using compareTo because internally use compareTo
            }
        });
        System.out.println("Student list sorted by name");
        for(Student s:stdList){
            System.out.println("Name : "+s.getName()+" Age : "+s.getAge());
        }

    }

}

class CustomIntegerSorting implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

class CustomStringLengthSorting implements Comparator<String>{

    @Override public int compare(String o1, String o2){
        return o2.length()-o1.length();
    }
}


class Student{

    private String name;
    private int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
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
}