import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    private static Scanner scan = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.format("Enter %d numbers!\n", number);
        for (int i = 0; i < number; ++i) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int temp = 0;
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
//        for (int i = 0; i < sortedArray.length; ++i) {
//            for (int j = 0; j < sortedArray.length - i - 1; ++j) {
//                if (sortedArray[j] < sortedArray[j + 1]) {
//                    temp = sortedArray[j];
//                    sortedArray[j] = sortedArray[j + 1];
//                    sortedArray[j + 1] = temp;
//                }
//            }
//        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int a: array) {
            System.out.format("%d ", a);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.format("Enter the size of the array:\t");
        int number = scan.nextInt();
        int[] array = getIntegers(number);
        array = sortIntegers(array);
        printArray(array);
        scan.close();
    }
}
