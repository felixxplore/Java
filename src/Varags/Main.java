package Varags;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Main.displayArray("Radhe",1,2,3,4);

        // formatted string by String.format(formatstring)
        String formatted=String.format("Name : %s, Age: %d, weight : %2f, new line : %n", "Satyam",22,67.90);
        System.out.println(formatted);
        System.out.printf("Name : %s, Age: %d, weight : %2f, new line : %n", "Satyam",22,67.90);
    }

    public static void displayArray(String msg,int... args){
        System.out.println(msg);
        for(int e:args){
            System.out.println(e);
        }
    }
}
