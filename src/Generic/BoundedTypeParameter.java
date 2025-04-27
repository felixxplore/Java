package Generic;


class Box<T extends Number>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }
}


public class BoundedTypeParameter {
    public static void main(String[] args) {

        Box<Integer> box=new Box<>();
//        Box<String> box2=new Box<>(); // ye nahi hoga kyonki
    }
}
