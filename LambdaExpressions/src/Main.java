import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from Runnable\nLine 2");
            System.out.format("This is from line %d\n", 3);
        }).start();
    }
}
