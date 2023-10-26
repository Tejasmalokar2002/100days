import java.util.*;

class Day44 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 9, 10, 12, 15, 18 };
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
