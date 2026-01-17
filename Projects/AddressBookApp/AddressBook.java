package Demo.AddressBookApp;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    
    static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phoneNumber, email));
        System.out.println("Contact added successfully!");
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String search = sc.nextLine();
        boolean found = false;

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(search)) {
                c.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String deleteName = sc.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equalsIgnoreCase(deleteName)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }

        System.out.println("Contact not found!");
        
    }
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
 int choice;

        do {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:addContact();break;
                case 2:viewContacts();break;
                case 3:searchContact();break;
                case 4:deleteContact();break;
                case 5:System.out.println("Goodbye");break;
                default:System.out.println("Invalid choice!");
            }

        } while (choice != 5);

      }


}
