public class Main {
    public static void main(String[] args) {
        ITelephone phone = new DeskPhone(123456);
        phone.powerOn();
        phone.callPhone(123456);
        phone.answer();

        phone = new MobilePhone(123456);
        phone.callPhone(123456);
        phone.answer();
    }
}
