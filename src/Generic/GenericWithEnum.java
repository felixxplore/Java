package Generic;


enum Operation{
    ADDITION, SUBTRACTION,MULTIPLICATION,DIVISION;

    public <T extends Number> double apply(T a, T b){
        switch (this){
            case ADDITION :
                return a.doubleValue()+b.doubleValue();
            case SUBTRACTION:
                return a.doubleValue()-b.doubleValue();
            case MULTIPLICATION:
                return a.doubleValue() * b.doubleValue();
            case DIVISION:
                return a.doubleValue()/b.doubleValue();
            default:
                throw new AssertionError("Unknown operation : "+this);

        }
    }
}



public class GenericWithEnum {
    public static void main(String[] args) {

        System.out.println(Operation.ADDITION.apply(10,12));
    }
}
