import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void options() {
        System.out.println("1 -> Print the list of contacts\n" +
                "2 -> Add a new Contact\n" +
                "3 -> Update an existing Contact\n" +
                "4 -> Remove a contact\n" +
                "5 -> Search a contact\n" +
                "6 -> Quit\n");
    }

    public static void main(String[] args) {
        MobilePhone sridhar = new MobilePhone();
        boolean quit = false;
        options();
        while (!quit) {
            System.out.print("Enter choice:\t");
            int choice = scan.nextInt();
            scan.nextLine();
            System.out.flush();
            String name;
            long phoneNumber;
            switch(choice) {
                case 0:
                    options();
                    break;
                case 1:
                    sridhar.printContacts();
                    break;
                case 2:
                    System.out.print("\fNEW CONTACT =>\nName:\t");
                    name = scan.nextLine().trim();
                    System.out.print("Phone Number:\t");
                    phoneNumber = scan.nextLong();
                    scan.nextLine();
                    Contact contact = new Contact(name, phoneNumber);
                    System.out.println(sridhar.addContact(contact)? "CONTACT ADDED SUCCESSFULLY!": "FAILED TO ADD NEW CONTACT");
                    break;
                case 3:
                    System.out.print("\fUPDATE CONTACT =>\nOld Contact Name:\t");
                    name = scan.nextLine().trim();
                    System.out.print("Old Phone Number:\t");
                    phoneNumber = scan.nextLong();
                    scan.nextLine();
                    Contact oldContact = new Contact(name, phoneNumber);
                    System.out.print("New Contact Name:\t");
                    String newName = scan.nextLine().trim();
                    System.out.print("New Contact Phone Number:\t");
                    long newPhoneNumber = scan.nextLong();
                    Contact newContact = new Contact(newName, newPhoneNumber);
                    if (sridhar.updateContact(oldContact, newContact)) {
                        System.out.println("UPDATE SUCCESSFUL!");
                    } else {
                        System.out.println("UPDATE FAILED!!");
                    }
                    break;
                case 4:
                    System.out.print("\fREMOVE CONTACT =>\nContact Name:\t");
                    name = scan.nextLine().trim();
                    System.out.print("Contact Phone number:\t");
                    phoneNumber = scan.nextLong();
                    scan.nextLine();
                    Contact toBeRemoved = new Contact(name, phoneNumber);
                    System.out.println(sridhar.removeContact(toBeRemoved)? "CONTACT REMOVED SUCCESSFULLY": "CONTACT REMOVAL FAILED");
                    break;
                case 5:
                    System.out.print("\fCONTACT SEARCH => \nContact Name:\t");
                    name = scan.nextLine().trim();
                    System.out.print("Contact Phone Number:\t");
                    phoneNumber = scan.nextLong();
                    scan.nextLine();
                    Contact search = new Contact(name, phoneNumber);
                    System.out.println(sridhar.searchContact(search)? "Contact found".toUpperCase(): "CONTACT NOT FOUND");
                    break;
                case 6:
                    System.out.println("quitting...".toUpperCase());
                    for (int i = 0; i < 1000000; i++);
                    quit = true;
            }
        }
        scan.close();
    }
}

