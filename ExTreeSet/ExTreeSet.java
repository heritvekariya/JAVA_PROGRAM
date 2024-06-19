package ExTreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class ExTreeSet {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        // Create a TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Sharvii");
        ts.add("Ram");
        ts.add("Shreya");
        ts.add("Pihan");
        System.out.println("TreeSet: " + ts);

        ts.remove("Orange");
        System.out.println("TreeSet after removing Orange: " + ts);

        System.out.println("Iterating over TreeSet:");
        Iterator<String> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String firstElement = ts.first();
        String lastElement = ts.last();
        System.out.println("First Element Name is: " + firstElement);
        System.out.println("Last Element Name is: " + lastElement);

        // Clear all elements
        ts.clear();
        System.out.println("TreeSet after clearing: " + ts);
    }
}

