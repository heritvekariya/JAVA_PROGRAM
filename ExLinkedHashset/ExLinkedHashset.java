package ExLinkedHashset;
import java.util.LinkedHashSet;

public class ExLinkedHashset {

    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> ob = new LinkedHashSet<>();

        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        System.out.println("Initial LinkedHashSet: " +ob);
        ob.add("A");
        ob.add("B");
        System.out.println("After adding duplicates: " + ob);

        ob.remove("C");
        System.out.println("After removing 'C': " +ob);

        // Check if an element exists in the LinkedHashSet
        boolean contains = ob.contains("D");
        System.out.println("LinkedHashSet contains 'D': " + contains);

        System.out.println("Iterating over LinkedHashSet:");
        for (String element : ob) {
            System.out.println(element);
        }
    }
}

