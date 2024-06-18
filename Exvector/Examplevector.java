package Exvector;
import java.util.Vector;
import java.util.Iterator;

public class Examplevector {
    public static void main(String[] args) {
        Vector<String> name = new Vector<>();
        name.add("Utsav");
        name.add("Herit");
        name.add("Dhaval");
        name.add("Parth");

        System.out.println("First Element: " + name.get(0));  
        System.out.println("Second Element: " + name.get(1)); 

        System.out.println("Using an Iterator:");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String nm = iterator.next();
            System.out.println(nm);
        }
        name.remove(2);
        System.out.println("Size of Vector after removal: " +name.size());
        System.out.println("Remaining Elements in the Vector:");
        iterator = name.iterator(); 
        while (iterator.hasNext()) {
            String nm = iterator.next();
            System.out.println(nm);
        }
    }
}

