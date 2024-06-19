package ExTreeMap;
import java.util.Map;
import java.util.TreeMap;

public class ExTreeMap {

    public static void main(String[] args) {
    
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(55,"Utsav");
        tm.put(43,"Rutvi");
        tm.put(67,"Herit");
        tm.put(57,"Dhaval");
        System.out.println("TreeMap is: " +tm);
        String removedElement = tm.remove(67);
        System.out.println("Removed Element with key 3: " + removedElement);
        System.out.println("TreeMap after removal: " +tm);

        String retrieve = tm.get(55);
        System.out.println("Retrieved Element is: " + retrieve);

        System.out.println("TreeMap entries are:");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ",Value: " + entry.getValue());
        }
    }
}

