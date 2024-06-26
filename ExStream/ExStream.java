package ExStream;
import java.util.Arrays;
import java.util.stream.Stream;

public class ExStream {
    public static void main(String[] args) {
        // Creating a stream from a set of integers
        Stream<Integer> m = Stream.of(12, 678, 90, 24, 435);
        m.forEach(System.out::println);
    
        Integer[] arr1 = {5, 6, 89, 0, 12};
        
        Stream<Integer> sarr = Arrays.stream(arr1);
        System.out.println(sarr.count());
        
        Arrays.stream(arr1).forEach(System.out::println);
    }
}
