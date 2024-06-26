package Exlambda;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable table = (n) -> {
            System.out.println("Multiplication table for " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        };

        table.printTable(5); 
        System.out.println(); 
        table.printTable(10); 
    }
}
