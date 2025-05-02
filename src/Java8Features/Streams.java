package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // Predicate hold condition
        Predicate<Integer> isEven=x->x%2==0;
        System.out.println(isEven.test(10));

        Predicate<String> startWithA=x->x.startsWith("A");
        Predicate<String> endWithZ=x->x.endsWith("Z");

        // combine Predicates with same type
        Predicate<String> and = startWithA.and(endWithZ);
        System.out.println(and.test("AadhZ"));


        // Function --> it does something for us
        Function<String,String> convertToUppercase=x->x.toUpperCase();
        Function<String,String> convertToLowercase=x->x.toLowerCase();
        System.out.println(convertToUppercase.apply("Radhe Radhe"));
        System.out.println(convertToUppercase.andThen(convertToLowercase).apply("Felix"));
        System.out.println(convertToLowercase.andThen(convertToUppercase).apply("Felix"));
        System.out.println(convertToUppercase.compose(convertToLowercase).apply("Felix"));


        // Function.identity() -> return value whatever you pass
        Function<Integer,Integer> identity = Function.identity();
        System.out.println(identity.apply(5));


        // Consumer-->  uses but return nothing you can print
        Consumer<String> print=x-> System.out.println(x);
        print.accept("print Consumer");

        // Supplier -> lega kuch nahi par dega jarur
        Supplier<String> supplier=()-> "Radhe Radhe";
        System.out.println(supplier.get());


        // combined all things
        Predicate<Integer> predicate=x->x%2==0;
        Function<Integer,Integer> function=x->x*x;
        Consumer<Integer> consumer=x-> System.out.println(x);
        Supplier<Integer> supplier1=()->100;
        if(predicate.test(supplier1.get())){
            consumer.accept(function.apply(supplier1.get()));
        }

        // BiPredicate, BiConsumer, BiFunction
        // UnaryOperator -> input and return both same type extednds Function
        // BinaryOperator --> 2 inputs and return are same type extends BiFunction

        // Method reference --> use method without invoking & in place of lambda expression
        List<String> list = Arrays.asList("Dhru", "Krunal", "Ashwin");
        list.forEach(System.out::println);


        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhones> collect = names.stream().map(MobilePhones::new).collect(Collectors.toList());

        // Stream --> a sequence of elements supporting various operations
        /*
        * Source
        * intermediate operations
        * terminal operations
        */

        // traditional way to count even numbers in list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int count=0;
        for(Integer e:numbers){
            if(e%2==0){
                count++;
            }
        }
        System.out.println(count);


        // Using stream
        System.out.println(numbers.stream().filter(x-> x%2==0).count());


    }
}

class MobilePhones{
    String name;

    public MobilePhones(String name){
        this.name=name;
    }
}
