package Collections.MapInterface;

import java.lang.ref.WeakReference;

public class Weakreference {
    public static void main(String[] args) {

        WeakReference<Phone> p=new WeakReference<>(new Phone("apple","iphone11"));
        System.out.println(p.get());
        System.gc(); // now we suggest jvm to scan and remove weak reference object

        try{
            Thread.sleep(10000);
        }catch(Exception e){}

        System.out.println(p.get());
    }
}

class Phone{
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

