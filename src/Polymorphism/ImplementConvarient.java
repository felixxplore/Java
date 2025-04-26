package Polymorphism;


class  Fruit{
    Fruit getInstance(){
        return new Fruit();
    }
    void makeSound(){
        System.out.println("Fruit");
    }
}

class Mango extends Fruit{
    @Override
    Mango getInstance(){
        return new Mango();
    }

    @Override
   public void makeSound(){
        System.out.println("mango");
    }
}

public class ImplementConvarient {
    public static void main(String[] args) {

        Fruit f1=new Mango();
        Fruit f2=f1.getInstance();
        f2.makeSound();
    }
}
