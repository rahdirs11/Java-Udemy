public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = new GearBox.Gear(1, 12.3);

        GearBox.Gear second = new GearBox.Gear(2, 16.4);    // for static inner class
        /*
        * We would use
        * GearBox.Gear second = mcLaren.new Gear(2, 16,4);
        * for non-static inner class!
        *
        * Both cases, the inner class is not local to any method!!
        * */

//        System.out.println(first.driveSpeed(1000));
    }
}
