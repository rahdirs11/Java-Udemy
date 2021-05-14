public class Contact {
    String name;
    long phoneNumber;

    Contact() {
        this("Unknown", 0000000000);
    }

    Contact(String name) {
        this(name, 0000000000);
    }

    Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    String getName() {
        return this.name;
    }

    long getPhoneNumber() {
        return this.phoneNumber;
    }
}
