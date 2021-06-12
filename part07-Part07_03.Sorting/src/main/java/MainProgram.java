
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {4, 7, 8, 6, 9, 2, 3};
        MainProgram.sort(numbers);
    }

    public static int smallest(int array[]) {
        int min_el = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min_el]) {
                min_el = i;
            }
        }
        return array[min_el];
    }

    public static int indexOfSmallest(int[] array) {
        int min_el = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min_el]) {
                min_el = i;
            }
        }
        return min_el;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int min_el = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[min_el]) {
                min_el = i;
            }
        }
        return min_el;
    }

    public static void swap(int[] array, int index1, int index2) {
//     swapping with help of variable
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }

    }

}
