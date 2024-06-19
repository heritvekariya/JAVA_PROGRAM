package Exqueue;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
    public static void main(String[] args) {
        // Create a queue
        Queue<String> queue = new LinkedList<>();

        queue.add("Element1");
        queue.add("Element2");
        queue.add("Element3");
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        String remove = queue.poll();
        System.out.println("Removed Element: " + remove);

        // Peek at the front element of the queue without removing it
        String front = queue.peek();
        System.out.println("Front Element: " + front);
        System.out.println("Queue after removal: " + queue);
    }
}
