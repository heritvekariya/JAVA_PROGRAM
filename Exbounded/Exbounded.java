package Exbounded;

import java.util.List;

public class Exbounded {
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (T element : source) {
            destination.add(element);
        }
    }
}
