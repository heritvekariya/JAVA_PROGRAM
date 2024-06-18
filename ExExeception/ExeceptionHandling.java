package Exeception;
import java.util.*;
 
public class ExeceptionHandling {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int no1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int no2 = sc.nextInt();

            int result = no1 / no2;
            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e) {
            System.out.println("It can't be divided by Zero");
        } 
        finally {
            System.out.println("Hello...!");
            sc.close();
        }
    }
}
