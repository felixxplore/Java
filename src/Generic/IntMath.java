package Generic;

public class IntMath<T> {
    private T a;
    private T b;



    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public static void main(String[] args) {

        IntMath<Integer> Int=new IntMath<>();
        Integer a1 = Int.getA();
        Integer b1=Int.getB();

    }
}

