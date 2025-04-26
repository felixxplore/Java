class Student implements Cloneable {
  public  String name;
    public int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this== obj) return true;
        if(!(obj instanceof Student)) return false;
        Student std=(Student) obj;
        return this.age==std.age && this.name.equals(std.name);
    }
    @Override
    public int hashCode(){
        int result=10;
        result= 31 * result + name.hashCode();
        result=31 * result + age;
        return result;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone(); // shallow copy
    }

}

public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1=new Student("felix",21);
        Student s2=new Student("felix",21);
        Student s3=new Student("sattu",22);
        boolean ans=s1.equals(s3);
        System.out.println(ans);

        System.out.println("student s1 hashcode : "+ s1.hashCode());
        System.out.println("Student s2 hashcode : "+s2.hashCode());
        System.out.println("Student s3 hashcode : "+s3.hashCode());

        Student s4=s3.clone();
       String result= s4.toString();
        System.out.println(result);
        System.out.println(s4.equals(s2));

        s4.age=100;
        System.out.println(s4 );
        System.out.println(s3);
    }
}
