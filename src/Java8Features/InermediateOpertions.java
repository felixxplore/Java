package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InermediateOpertions {
    public static void main(String[] args) {

        // Intermediate operations transform a strea into another stream
        // they are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. Filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ram","Ghanshyam");
        List<String> a = list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);

        // after process what you want  --> list, count, etc without this kuch nahi hoga, operation process hoga par return kuch nahi karega


        // 2. map
        List<String> collect = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        Stream<String> stringStream = list.stream().map(String::toLowerCase);

        // 3. sorted -> follow natural ordering
        Stream<String> sorted = list.stream().sorted();
        // you can add comparator
        Stream<String> sorted1 = list.stream().sorted(Comparator.comparingInt(String::length));

        // 4. distinct --> Need unique values so follow set
        long a1 = list.stream().filter(x -> x.startsWith("R")).distinct().count();
        System.out.println(a1);

        // 5. limit
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(5);
        
        // 6. skip --> we can skip in strema
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).skip(10).limit(100);

        // 7. peek -> operation bich me karne hote hain
        // Performance an action on each element as it is consumed.
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

        // 8. flatmap --> convert multidimension to single list
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));

        System.out.println(listOfLists.stream().flatMap(x->x.stream()).map(x-> x.toUpperCase()).toList());;

        List<String> sentences = Arrays.asList(
                "Hello world", "Java streams are powerful", "flatMap is useful"
        );

        System.out.println(sentences.stream().flatMap(x->Arrays.stream(x.split(" "))).map(x->x.toUpperCase()).toList());

    }
}
