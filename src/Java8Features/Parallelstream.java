package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Parallelstream {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorials = list.stream().map(Parallelstream::factorial).toList();
        long endTime=System.currentTimeMillis();

        System.out.println("Time taken with stream : "+(endTime-startTime)+" ms");

    startTime=System.currentTimeMillis();
   factorials = list.parallelStream().map(Parallelstream::factorial).toList();
        endTime=System.currentTimeMillis();

        System.out.println("Time taken with stream : "+(endTime-startTime)+" ms");


        // cumlative sum
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum=new AtomicInteger(0);
//        for(int i=0;i<numbers.size();i++){
//            sum+=numbers.get(i);
//            System.out.print(sum+" ");
//        }
        List<Integer> cumlativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
        System.out.println("Actual result with parallel stream : "+cumlativeSum);



    }

    private static long factorial(int n){
        long result=1;
        for(int i=2;i<=n;i++){
            result+=i;
        }
        return result;
    }
}
