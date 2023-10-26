import java.util.Arrays;
import java.util.LinkedHashSet;

class Day48 {
    // Function to remove duplicates from an array
    static int[] removeDuplicates(int[] arr) {
        // Convert array to LinkedHashSet to remove duplicates while preserving the order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : arr) {
            set.add(value);
        }

        // Convert LinkedHashSet back to array
        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }
        return result;
    }

    // Main method to test the program
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5, 6, 3};
        int[] result = removeDuplicates(arr);
        System.out.println("Array with duplicates: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
