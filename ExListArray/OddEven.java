package ExListArray;
import java.util.ArrayList;
import java.util.List;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);
        numbers.add(20);
        numbers.add(17);
        numbers.add(6);
        numbers.add(11);
        numbers.add(4);
        numbers.add(9);

        int sumEven = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { 
                sumEven += number; 
            }
        }
        System.out.println("Total sum of even numbers: " + sumEven);
	}
}