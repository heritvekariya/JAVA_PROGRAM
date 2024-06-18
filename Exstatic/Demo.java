package Exstatic;

public class Demo {
    public static void main(String[] args) {
        // Creating instances of StaticExample class
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        // Calling instance method
        obj1.displayId();
        obj2.displayId();
        obj3.displayId();

        // Calling static method
        StaticExample.displayCount();
        
        // Calling another static method
        StaticExample.staticFunction();
    }
}

