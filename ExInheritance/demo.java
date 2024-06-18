package inheritance;

public class demo {
    public static void main(String[] args) {
        rectangle ob1 = new rectangle(10, 5);
        ob1.printArea();    
        ob1.printPerimeter(); 

        square ob2 = new square(4);
        ob2.printArea();     
        ob2.printPerimeter();    
    }
}
