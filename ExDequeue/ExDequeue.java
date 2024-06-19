package ExDequeue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeue {

    public static void main(String[] args) {
        // Create a Dequeue
        Deque<String> dq = new ArrayDeque<>();

        // Add elements to the front and end of the deque
        dq.addFirst("Utsav");
        dq.addLast("Herit");
        dq.addFirst("Dhaval");
        dq.addLast("Parth");
        System.out.println("Deque is: " +dq);

        String removedFirst = dq.removeFirst();
        System.out.println("Removed from front: " + removedFirst);

        String removedLast = dq.removeLast();
        System.out.println("Removed from end: " + removedLast);

        String frontElement = dq.peekFirst();
        System.out.println("Front element: " + frontElement);

        String lastElement = dq.peekLast();
        System.out.println("Last element: " + lastElement);

        System.out.println("Deque after removals: " + dq);
        
        dq.addFirst("Rutvii");
        dq.addLast("Nency");
        System.out.println("Updated Deque: " +dq);
    }
}
