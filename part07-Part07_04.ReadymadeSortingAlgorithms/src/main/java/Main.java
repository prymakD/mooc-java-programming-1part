
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        sortIntegers(numbers);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings);
    }

}
