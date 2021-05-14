import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge3 {
    private static Scanner scan = new Scanner(System.in);

    public static int[] getIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; ++i) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = array.length - 1, j = 0; i > -1; --i) {
            array[i] = newArray[j++];
        }
    }

    public static void main(String[] args) {
        int count = scan.nextInt();
        int[] array = getIntegers(count);
        printArray(array);
        ArrayList<Integer> arrayList = new ArrayList<>();
        reverse(array);
        printArray(array);
    }
}
