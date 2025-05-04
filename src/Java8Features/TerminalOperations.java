package Java8Features;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        //  1. collect
        list.stream().skip(1).collect(Collectors.toList());
        List<Integer> list1 = list.stream().skip(1).toList();

        // 2. for each -> not get only consume
        list.stream().forEach(x-> System.out.println(x));

        // 3. reduce : combines elements to produce a single result
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x * y);
        System.out.println(reduce.get());
        // Optional means container me value ho bhee sakti hain and nahi bhee.

        // 4. count

        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);// ek bhee number even hain vo check karega
        list.stream().allMatch(x->x%2==0); // it return true if all elements are even
        list.stream().noneMatch(x->x%2==0);  // it return true if ek bhee number even nahi hoga tab

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst()); // firste element return karega
        System.out.println(list.stream().findAny()); // it return any element from list


        // get string with specific length
        List<String> list2 = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(list2.stream().filter(x-> x.length() <=3).toList());

        // Example : Squaring and Sorting numbers
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list3.stream().map(x->x*x).sorted().toList());

        // Example : Summing values
       List<Integer> list4 =Arrays.asList(1,2,3,4,5);
        System.out.println(list4.stream().reduce(Integer::sum));

        // Example : Counting occurances of a character
        String sentence="Hello world";
        long chars = sentence.chars().filter(x-> x == 'l').count();
        System.out.println(chars);


        // stateless  operations --> when ek bari me ek element pe kaam kar raha hain -> like filtering
        // stateful operation like sorting --> sare element ke bareme pata hain kyonki sorting me sare elements ke baremee pata hona chiaye

        // 7. toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min/max
        System.out.println(Stream.of(2,44,21,55).max(Comparator.naturalOrder()));

        
        // stream cannot be reusedd after a terminal operation has been called
        Stream<String> stream=list2.stream();
        stream.forEach(System.out::println); // now this called terminal
        // so after terminal called you can not use stream
//        List<String> list5 = stream.map(String::toUpperCase).toList();


        // 9.  for each order
        // in parallel stream you want to perform tasks in orderwise

        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forach with parallel stream");
        list5.parallelStream().forEach(System.out::println); // ye order me nhai hoga
        list5.parallelStream().forEachOrdered(System.out::println); // ye order me hoga





    }
}
