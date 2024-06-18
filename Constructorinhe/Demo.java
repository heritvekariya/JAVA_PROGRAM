package Constructorinhe;

public class Demo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Utsav Patel", 20, "9316155454", "Ahmedabad", 78000, "Software Development");
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Specialization: " + employee.getSpecialization());
        employee.printSalary();

        // Create a Manager object
        Manager manager = new Manager("Akash Patel", 25, "9898787845", "Anand", 75000.0, "Human Resources");
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Phone Number: " + manager.getPhoneNumber());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Department: " + manager.getDepartment());
        manager.printSalary();
    }
}

