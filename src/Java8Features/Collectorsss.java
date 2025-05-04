package Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class Collectorsss {
    public static void main(String[] args) {

        // Collectors is a utility class
        // provides a set of methods to create common collections


        // 1. Collecting to a list
        // 2. Collecting to a set
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 3, 3, 3, 3);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a specified Collection
        ArrayDeque<Integer> collect = nums.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // 4. Joining Strings
        // concatenatees stream elements into a single string
        List<String> names = Arrays.asList("radhe", "Aram", "soja", "kese");
        String concate = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));

        // 5. Summerizing data
        // generate statistical summary --> count,sum, min, average, max
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("count: "+stats.getCount());
        System.out.println("sum : "+stats.getSum());
        System.out.println("min : "+stats.getMin());
        System.out.println("max : "+stats.getMax());
        System.out.println("average : "+stats.getAverage());

        // 6. calculating average
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average : "+average);

        //  7. grouping elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        List<String> fourLength = words.stream().filter(x -> x.length() == 4).toList();
        System.out.println(fourLength);

        // but agar length ke according specific grouping karni ho tab
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treemap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treemap);

        // 9. parititioning elements
        // partition elements into two groups true and flase based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x->x.length() > 5)));;

        // 10. Mapping and collecting
        // applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));


        System.out.println(words.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length() )));

        System.out.println(words.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y)));

    }
}
