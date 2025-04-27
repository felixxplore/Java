package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

        List<? extends Number> upperBound= Arrays.asList(1,2,1.5); // upper bound me add nahi hota through wildcard
        List<? super Integer> lowerBound= Arrays.asList(1,2,1.5); // lower bound me add hota hain through wildcard
        lowerBound.add(10); // yaha pe hamko pata hain ki integer to hoga hee and jo bhee integer ko super class hain vo ho sakte hain
        upperBound.add(null); // if you try here to add integer nahi hoga  kyonki hamko nahi pata ki konse type ka ho sakta hain

     }

    // without wildcard : this is  lowerbound
    public static int sum(ArrayList<? super Integer> numbers){
        int sum=0;
        for(Object o:numbers){
            sum+=(int)o;
        }
        return sum;
    }

    // with generic : this is upperbound
    public static double add( List<? extends Number> numbers){
        double sum=0;
        for(Number n:numbers){
            sum+=n.doubleValue();
        }
        return sum;
    }
}
