import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> phone;

    MobilePhone() {
        phone = new ArrayList<>();
    }

    private int checkContact(Contact contact) {
        int index = 0;
        for (Contact c: phone) {
            if (c.getName().equals(contact.getName())) {
                return index;
            }
            ++index;
        }
        return -1;
    }

    public void printContacts() {
        if (getTotalContacts() == 0) {
            System.out.println("NO CONTACTS AVAILABLE!!");
            return;
        }
        System.out.println("List of contacts =>");
        for (Contact c: phone) {
            System.out.format("Name:\t%s\nPhone Number:\t%d\n========================================\n", c.getName(), c.getPhoneNumber());
        }
    }

    public boolean addContact(Contact contact) {
        if (checkContact(contact) == -1) {
            phone.add(contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = checkContact(contact);
        if (index != -1) {
            phone.remove(index);
            return true;
        }
        return false;
    }

    public int getTotalContacts() {
        return this.phone.size();
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = 0;
        if (checkContact(oldContact) != -1) {
//            for ( ; index < getTotalContacts(); ++index) {
//                Contact current = phone.get(index);
//                if (current.getName().equals(oldContact.getName()) && current.getPhoneNumber() == oldContact.getPhoneNumber()) {
//                    break;
//                }
//            }
            phone.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean searchContact(Contact contact) {
        return checkContact(contact) != -1;
    }
}
