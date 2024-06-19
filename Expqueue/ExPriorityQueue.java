package Expqueue;
import java.util.*;

public class ExPriorityQueue {
	 public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        // Create a priority queue
	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        // Add elements to the priority queue
	        pq.add(10);
	        pq.add(20);
	        pq.add(30);
	        pq.add(40);
	        System.out.println("Priority Queue: " + pq);
	        int removedElement = pq.poll();
	        System.out.println("Removed Element: " + removedElement);

	        // Peek at the highest priority element (smallest element)
	        int frontElement = pq.peek();
	        System.out.println("Front Element: " + frontElement);

	        System.out.println("Priority Queue after removal: " + pq);
	    }
}