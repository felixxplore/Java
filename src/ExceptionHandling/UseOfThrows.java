package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseOfThrows {
    public static void main(String[] args) throws FileNotFoundException {

        UseOfThrows t1=new UseOfThrows();
        // now 2 option we handle exception through trycatch block or throws
        // now hamne responsibility of excpeiton hain vo jvm par choid so agar file exist hogi to exception throw nahi hoga and if file nahi hogi then exception
        // throw hoga
        t1.method1();
        System.out.println("radhe radhe");
    }
    public  void method3() throws FileNotFoundException{
        FileReader f1=new FileReader("src/ExceptionHandling/file.txt");
    }
    public  void method2() throws FileNotFoundException {
         method3();
    }

    public void method1() throws FileNotFoundException {
          method2();
    }
}


