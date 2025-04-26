package Polymorphism;


class Animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog makes sound");
    }

    public void bark(){
        System.out.println("Dog barking");
    }
}
public class UpDownCasting {
    public static void main(String[] args) {

        Dog d1=new Dog();
        Animal animal=d1; // upcasting
        animal.makeSound();


         if(animal instanceof Dog){
            Dog d2= (Dog) animal; // downcasting : this run beause animal reference to the actuall dog object
            d2.bark();
        }

         Animal a1=new Animal();
         if(a1 instanceof Dog){
             Dog dogAgain=(Dog) a1; // while this not work because of object of a1 class is animal class so
             dogAgain.bark();
         }else{
             System.out.println("a1 is not object of dog");
         }

    }
}
