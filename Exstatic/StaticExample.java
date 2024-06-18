package Exstatic;

public class StaticExample {
    // Static variable
    static int count = 0;
    
    // Another static variable
    static String staticMessage;
    
    // Static block
    static {
        staticMessage = "Static block initialized.";
        System.out.println(staticMessage);
    }

    // Instance variable
    int id;

    // Constructor
    public StaticExample() {
        count++;
        id = count;
    }

    // Static method
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
    
    // Another static method
    public static void staticFunction() {
        System.out.println("This is a static function.");
    }

    // Instance method
    public void displayId() {
        System.out.println("Object ID: " + id);
    }
}

