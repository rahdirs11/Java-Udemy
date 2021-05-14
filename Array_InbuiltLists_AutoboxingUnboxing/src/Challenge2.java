import java.util.Scanner;

public class Challenge2 {
    private static Scanner scan = new Scanner(System.in);
    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; ++i) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int minimumElement = Integer.MAX_VALUE;
        for (int a: array) {
            minimumElement = Math.min(a, minimumElement);
        }
        return minimumElement;
    }

    public static void main(String[] args) {
        int count = scan.nextInt();
        int array[] = readIntegers(count);
        System.out.println("Minimum value from array:\t" + findMin(array));
        scan.close();
    }
}
