package Exgeneric;

public class Main {
    public static void main(String[] args) {
       
        Exgeneric<Integer, String> pair1 = new Exgeneric<>(1, "Apple");
        System.out.println("Pair 1: " + pair1);

        Exgeneric<Double, Boolean> pair2 = new Exgeneric<>(2.5, true);
        System.out.println("Pair 2: " + pair2);

        Exgeneric<String, String> pair3 = new Exgeneric<>("Hello", "World");
        System.out.println("Pair 3: " + pair3);
    }
}
