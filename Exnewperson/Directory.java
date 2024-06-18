package Expolymorphism;
import java.util.*;

public class Directory {
    private Person[] directory;
    private int size;
    private int count;

    public Directory(int size) {
        this.size = size;
        directory = new Person[size];
        count = 0;
    }

    public void createEntry() {
        Scanner sc = new Scanner(System.in);

        if (count >= size) {
            System.out.println("Directory is full. Cannot add more entries.");
            return;
        }

        System.out.print("Enter Unique ID: ");
        String uniqueId = sc.nextLine();
        if (findPersonById(uniqueId) != null) {
            System.out.println("Unique ID already exists. Entry not created.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Telephone (if available): ");
        String telephone = sc.nextLine();
        System.out.print("Enter Mobile (if available): ");
        String mobile = sc.nextLine();
        System.out.print("Enter Head of Family: ");
        String headOfFamily = sc.nextLine();

        Person person = new Person(uniqueId, name, address, telephone, mobile, headOfFamily);
        directory[count++] = person;
        System.out.println("Entry created successfully.");
    }

    public void editEntry() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Unique ID of the entry to edit: ");
        String uniqueId = sc.nextLine();

        Person person = findPersonById(uniqueId);
        if (person == null) {
            System.out.println("Entry not found.");
            return;
        }

        System.out.print("Enter new Name: ");
        String name = sc.nextLine();
        person.setName(name);

        System.out.print("Enter new Address: ");
        String address = sc.nextLine();
        person.setAddress(address);

        System.out.print("Enter new Telephone: ");
        String telephone = sc.nextLine();
        person.setTelephone(telephone);

        System.out.print("Enter new Mobile: ");
        String mobile = sc.nextLine();
        person.setMobile(mobile);

        System.out.print("Enter new Head of Family: ");
        String headOfFamily = sc.nextLine();
        person.setHeadOfFamily(headOfFamily);

        System.out.println("Entry updated successfully.");
    }

    public void displayEntries() {
        if (count == 0) {
            System.out.println("No entries found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(directory[i]);
                System.out.println("-----------------------------");
            }
        }
    }

    private Person findPersonById(String uniqueId) {
        for (int i = 0; i < count; i++) {
            if (directory[i].getUniqueId().equals(uniqueId)) {
                return directory[i];
            }
        }
        return null;
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Display all entries");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    createEntry();
                    break;
                case 2:
                    editEntry();
                    break;
                case 3:
                    displayEntries();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) {
        Directory directory = new Directory(10); // Directory with capacity of 10 entries
        directory.displayMenu();
    }
}


