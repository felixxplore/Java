package DesignPrinciples;


class Animal{
    String color;
    String name;

    public Animal(String name, String color){
        this.color=color;
        this.name=name;
    }

    public void bark(){
        System.out.println("animal barking");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{

    public Dog(String name,String color){
        super(name,color);
    }

    @Override
    public void bark(){
        System.out.println("dog barking");
    }
}


public class IsARelationship {
    public static void main(String[] args) {

        Animal dog=new Dog("tommy","black");
        dog.bark();
        System.out.println(dog.getName());
    }
}


