package DesignPrinciples;


class Engine{
    String type;

    public Engine(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void drive(){
        System.out.println("Engine started.");
    }
}

class Car{
    String company;
    String model;
    Engine engine;

    public Car(String company,String model ){
        this.company=company;
        this.model=model;
        this.engine=null;
    }

    public void setEngine(Engine engine){
        this.engine=engine;
        System.out.println("in Car engine setup");
    }

    public void removeEngine(){
        this.engine=null;
        System.out.println("from car engine remove");
    }
    public void drive(){
        if(engine==null){
            System.out.println("car cant drive");
            return;
        }
        engine.drive();
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine.getType() +
                '}';
    }
}
public class HasARelationship {
    public static void main(String[] args) {

         Car bmw=new Car("BMW","model1");
         bmw.setEngine(new Engine("petrol"));
        bmw.drive();
     }
}
